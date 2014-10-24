(ns {{namespace}}.endpoint.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]
            [duct.util.macro :refer [defendpoint this-ns]]
            [duct.util.resource :as resource]))

(defendpoint example-endpoint []
  (GET "/" [] (resource/url (this-ns) "welcome.html")))
