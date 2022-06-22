(defproject com.fabiodomingues/lein-clj-depend "0.3.1-SNAPSHOT"
  :description "Lein plugin to run clj-depend"
  :url "https://github.com/clj-depend/lein-clj-depend"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :eval-in-leiningen true
  :dependencies [[com.fabiodomingues/clj-depend "0.6.1"]]
  :deploy-repositories [["releases" {:url "https://repo.clojars.org"
                                     :creds :gpg}]])
