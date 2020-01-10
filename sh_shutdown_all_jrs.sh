wmic Path win32_process Where "CommandLine Like '%.jar%'" Call Terminate
sleep 1
echo 
echo 
echo 
echo 'DONE...'
sleep 1