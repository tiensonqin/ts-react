(ns {{name}}.connect
  (:require [weasel.repl :as ws-repl]))

(ws-repl/connect "ws://localhost:9001" :verbose true)

