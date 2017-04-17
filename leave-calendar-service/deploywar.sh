/bin/rm -fv /c/TOOLS/jboss-as-7.1.1.Final/standalone/deployments/leave-calendar-service.war
/bin/rm -fv /c/TOOLS/jboss-as-7.1.1.Final/standalone/deployments/leave-calendar-service.war.deployed

sleep 4;
/bin/rm -fv /c/TOOLS/jboss-as-7.1.1.Final/standalone/deployments/leave-calendar-service.war.undeployed

sleep 4;

/bin/cp -vp /c/workspace/LeaveCalendarApp/leave-calendar-service/target/leave-calendar-service.war /c/TOOLS/jboss-as-7.1.1.Final/standalone/deployments/

