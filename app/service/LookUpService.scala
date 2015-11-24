package service

import models.VehicleDetails

class LookUpService {

  //vehicles in our database
  val v1 = VehicleDetails("SF08FPT","Nissan","123456789602")
  val v2 = VehicleDetails("NE60FGT","Toyota","123456789602")
  val v3 = VehicleDetails("DF61HNT","Honda","123456789602")
  val v4 = VehicleDetails("SH54RTG","BMW","123456789602")
  val v5 = VehicleDetails("SF88FPT","Range rover","123456789602")
  val v6 = VehicleDetails("MR05NGK","Mazda","123456789602")
  val v7 = VehicleDetails("EF04WED","Ford","123456789602")
  val v8 = VehicleDetails("DH07RTM","Vauxhall","123456789602")
  val v9 = VehicleDetails("H1EMS","Maserati","123456789602")
  val v10 = VehicleDetails("H1","Bugatti","123456789602")
  val v11 = VehicleDetails("S88GHT","Nissan","123456789602")
  val v12 = VehicleDetails("SF11THG","Nissan","123456789602")

  //stubbing the database
  val listOfCars = List(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12)

  def lookUp(vehicleReg: String): Option[VehicleDetails] = {
    listOfCars.find(_.vehicleReg == vehicleReg)
  }
}
