@echo off
if not exist target mkdir target
if not exist target\classes mkdir target\classes

SET PATH=%PATH%;C:\Program Files\Java\jdk1.7.0_80\bin;C:\Windows\Microsoft.NET\Framework64\v2.0.50727

echo compile classes
javac -nowarn -d target\classes -sourcepath jvm -cp "c:\jniexample\jni4net-0.8.8.0-bin\lib\jni4net.j-0.8.8.0.jar"; "jvm\inspec/ideas/trevorisation\OrganisationSplit.java" "jvm\inspec/ideas/trevorisation\PersonSplit.java" "jvm\inspec/ideas/trevorisation\Stemmer.java" 
IF %ERRORLEVEL% NEQ 0 goto end


echo Inspec.Ideas.Trevorisation.j4n.jar 
jar cvf Inspec.Ideas.Trevorisation.j4n.jar  -C target\classes "inspec\ideas\trevorisation\OrganisationSplit.class"  -C target\classes "inspec\ideas\trevorisation\PersonSplit.class"  -C target\classes "inspec\ideas\trevorisation\Stemmer.class"  > nul 
IF %ERRORLEVEL% NEQ 0 goto end


echo Inspec.Ideas.Trevorisation.j4n.dll 
csc /nologo /warn:0 /t:library /out:Inspec.Ideas.Trevorisation.j4n.dll /recurse:clr\*.cs  /reference:"C:\jniexample\jni4net-0.8.8.0-bin\lib\Inspec.Ideas.Trevorisation.dll" /reference:"C:\jniexample\jni4net-0.8.8.0-bin\lib\jni4net.n-0.8.8.0.dll"
IF %ERRORLEVEL% NEQ 0 goto end


:end
