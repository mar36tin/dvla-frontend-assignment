

DVLA Check car disc system



The application checks if your vehicle details are registered with the DVLA. 
It matches on the vehicle registration number. The vehicle registration number and make of the 
vehicle are mandatory. 

To run the DVLA checking car system, 

1. clone the repository to your local disk: git clone https://github.com/mar36tin/dvla-frontend-assignment.git

2. change directory to the root of the project: cd to/the/root/of/the/project
  
3. run the project: sbt "run 7700" (Note: you can use any port as long its not being used)

4. Use the test data below

Test Data (registered)

      | Vehicle Registration Number | Make        | V5C document reference number |
      | SF08FPT                     | Nissan      | 123456789601                  |
      | NE60FGT                     | Toyota      | 123456789602                  |
      | DF61HNT                     | Honda       | 123456789603                  |
      | SH54RTG                     | BMW         | 123456789604                  |
      | SF88FPT                     | Range rover | 123456789605                  |
      | MR05NGK                     | Mazda       | 123456789606                  |
      | EF04WED                     | Ford        | 123456789607                  |
      | DH07RTM                     | Vauxhall    | 123456789608                  |
      | HIEMS                       | Maserati    | 123456789609                  |
      | H1                          | Bugatti     | 123456789610                  |
      | S88GHT                      | Nissan      | 123456789610                  |
      | SF11THG                     | Nissan      | 123456789610                  |
    
Test Data (Not registered)    
 
      | Vehicle Registration Number | Make   | V5C document reference number |
      | SF03HGH                     | Honda  | 343456789601                  |
      | SH01RTG                     | Mini   | 143456789602                  |
      | SF11TBG                     | Nissan | 123456789610                  |
      
      
Running tests
    
    
 
 
 
 
 Martin Gwarada
 23 November 2015
