(ns lurest.core
  (:require [cljs.nodejs :as nodejs]
            diet))

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "Hello world!"))

(set! *main-cli-fn* -main)
