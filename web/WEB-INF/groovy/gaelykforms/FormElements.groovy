package gaelykforms

/**
 * Convenience methods for bound fields in a gaelyk web app
 */
class FormElements {

  private Map params
  private List errorFields

  def FormElements(Map params, List errorFields=[]) {
    this.params = params
    this.errorFields = errorFields
  }

  def String errorTest(String name, String fieldDef) {
    if (errorFields.contains(name)) return "<span class=\"fielderror\">${fieldDef}</span>"
    else return fieldDef
  }

  def String textField(String name, int cols=40) {
    String safeValue = params[name] == null ? "" : params[name]
    return errorTest(name, "<input name=\"${name}\" class=\"input\" type=\"text\" id=\"${name}\" size=\"${cols}\" value=\"${safeValue}\" />")
  }

  def String textArea(String name, int cols=40, int rows=5) {
    String safeValue = params[name] == null ? "" : params[name]
    return errorTest(name, "<textarea cols=\"${cols}\" class=\"textarea\" rows=\"${rows}\" name=\"${name}\" id=\"${name}\">${safeValue}</textarea>")
  }
  
}
