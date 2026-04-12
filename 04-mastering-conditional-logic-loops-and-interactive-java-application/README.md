#04 Mastering conditional logic loops and interactive java application

##Switch statement
- The switch statment elements are
    - switch
    - case
    - elements could be
        - break
        - default
- The switch statement compare the original value with the cases if if find a matching one execute the code (no more case checked) until the end of the statment or break statement
- Without brake statement the execution is fall through
- The return statement can break the fall through
- Not every type of variable is allowed to use in switch statements
    - allowed
        - byte, short, int, char allowed (wrappers included)
        - String, enum allowed
    - prhibited
        -double, float, long
- The switch has Traditional and Enhanced
    - Java is backward compatible both style is accaptable and the preferred style based on the project
    - Enhanced style (after java 14)
        - Clearer struckture
        - Use arrow token or switch expression arrow: ->
        - No brakes (not required)
        - Fall through never occure
        - Default value is required
        - To use a code block in a switch statement you have to use the yield keyword insted of the return --> { yield "1st"; }



