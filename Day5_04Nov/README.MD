<h1>Q1.ind and terminate the top memory-consuming process on your system.</h1>
<br>
<h3>1.top </h3>
<h3>2.ctrl+"M" to sort </h3>
<h3>3.sudo kill -9 <PID> </h3>

<h1>Q2. Create a user named devops and grant them sudo privileges.? </h1>

<h3>1.sudo adduser devops </h3>
<h3>2.sudo usermod -aG sudo devops </h3>
<h3>3.su - devops </h3>
<h3>4.sudo whoami </h3>

<h1> Q3.Connect to a remote server, create a directory, and copy files into it using SCP. </h1>

<h3> Step 1: Install SSH Server (installed by default) </h3>

<h3>sudo apt install openssh-server -y</h3>

<h3>Step 2: Check SSH Service Status </h3>

<h3>sudo systemctl status ssh <h3>

<h3> Step 3: Copy Files to Remote Server </h3>


<h3>scp file.txt user@remote_ip:/path/to/destination </h3>

<h3>
systemctl → Manages systemd services.</h3>

<h3>openssh-server → Enables remote SSH connections.</h3>

<h1>Q4.List all active processes and save only those containing the word java into a file.</h1>

<h3>ps aux  (Active processes list karna) </h3>
<h3>.ps aux | grep java (Ye command ps aux ke output me se sirf "java" word wale lines dikhayegi.)<h3>
<h3>ps aux | grep java > save.txt  (|=>pipeline operator) </h3>

Q5.<h1>Generate an SSH key pair and configure it for two different remote servers.</h1>


<h3>ssh-keygen -t rsa -b 4096 -C "lalit-kumar@mydevice"</h3>

 <h3>**Then copy the key to remote server</h3>

<h3>ssh-copy-id user@remote_ip</h3>

 <h1>Notes</h1>

<h2>-t rsa → Key type.</h2>

<h2>-b 4096 → Key size.</h2>

<h2>-C → Comment/identifier for the key.</h2>


<h1>Q6.Find all lines containing “error” in /var/log/syslog and redirect them to errors_found.txt </h1>


<h3>grep "error" /var/log/syslog > errors_found.txt</h3>

<h1>Q7. Find All .conf Files in /etc and Save Alphabetically</h1>
<h3>ind /etc -type f -name "*.conf" | sort > conf_list.txt </h3>


<h1>Q8. Display Total Number of Unique Shell Types </h1>
<h3>cut -d: -f7 /etc/passwd | sort | uniq | wc -l > shell_count.txt </h3>

<!-- <h1>Q9  Vim – Basic Commands </h1> -->

<h1>Q9.Reset Current User Password and Reboot </h1>

<h3>tar -czvf home_backup.tar.gz /home/your_username</h3>

<h1>Q11.Zip Home Directory and Transfer via SCP</h1>

<h2> Compress Home Directory </h2>
<h3>tar -cvf home_backup.tar ~ </h3>

<h2>Send to Another Machine </h2>

<h3>cp home_backup.tar user@remote_ip:/path/to/destination </h3>

<h2>Extract on Remote Machine </h2>

<h3> tar -xvf home_backup.tar </h3>


