(ns cmodoro.core
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

  (defn -main
    "The app's main function"
    [& args]
    (println "*** Your args: ", args)
  )
