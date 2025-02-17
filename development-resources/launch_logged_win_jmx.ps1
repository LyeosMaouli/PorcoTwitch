# To run this script, use the following command
# powershell -ExecutionPolicy ByPass -File .\launch_logged_win_jmx.ps1


$origEnvDir = [Environment]::CurrentDirectory
Push-Location $PSScriptRoot
[Environment]::CurrentDirectory = $PSScriptRoot

Start-Transcript -OutputDirectory $PWD
.\launch-jmx.bat --nowt
Stop-Transcript

Pop-Location
[Environment]::CurrentDirectory = $origEnvDir
