class DatabaseConnection <BasePage

  def makeDBConnection
  $client = Mysql2::Client.new(:host => "localhost", :port =>"3306", :username => "root",:password =>"", :database =>"tech_engineering_college")
  puts "Connection SuccesFull"
  end

  def extractEntireTabel
  results = $client.query("SELECT * FROM student_information")
  results.each do |row|
    # puts row["StudentId"]
    puts row
  end

  end



  def printInTabularForm
    results = $client.query("SELECT * FROM student_information")
    headers = results.fields
    results.each(:as => :array) do |row|
      puts row
      puts "\n"
    end
  end


  def printSymbolizeKey
     results = $client.query("SELECT * FROM student_information")
    # puts results.collect{ |row| "Then the next result was #{row}" }.join("\n")

     results.fields do |f|
       puts "#{f}\t"  # Column names
     end

     puts "\n"

     results.each do |rows| # Iterate through each row
       rows.each do |col| # Iterate through each column of the row
         puts "#{col}\t"
       end
       puts "\n"
     end

  end






  def printResult
    results = $client.query("SELECT * FROM student_information")


    results.each do |row|
      puts "#{row["StudentId"]}\t" + "#{row["Name"] }\t" + "#{row["Address"] }\t" + "#{row["Mobile"]}\t"
    end


  end





end