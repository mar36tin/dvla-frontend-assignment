package utils

object Regex {

  val vehicleNumberRegex = """(?<Current>^[A-Z]{2}[0-9]{2}[A-Z]{3}$)|(?<Prefix>^[A-Z][0-9]{1,3}[A-Z]{3}$)|(?<Suffix>^[A-Z]{3}[0-9]{1,3}[A-Z]$)|(?<DatelessLongNumberPrefix>^[0-9]{1,4}[A-Z]{1,2}$)|(?<DatelessShortNumberPrefix>^[0-9]{1,3}[A-Z]{1,3}$)|(?<DatelessLongNumberSuffix>^[A-Z]{1,2}[0-9]{1,4}$)|(?<DatelessShortNumberSufix>^[A-Z]{1,3}[0-9]{1,3})$"""

}
