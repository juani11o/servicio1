// @GENERATOR:play-routes-compiler
// @SOURCE:C:/SBT/servicio1/conf/routes
// @DATE:Mon Apr 02 09:25:12 COT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
