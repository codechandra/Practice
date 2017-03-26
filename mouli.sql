/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
declare
a STATION.LAT_N%type;
b STATION.LONG_W%type;
c STATION.LAT_N%type;
d STATIONS.LONG_W%type;
x number;
begin
select min(LAT_N) into a from STATION;
select min(LONG_W) into b from STATION;
select max(LAT_N) into c from STATION;
select max(LONG_W) into d from STATION;
x=round(sqrt(power((c-a),2)+power((d-b),2)),4);
dbms_output.put_line(x);
end;




