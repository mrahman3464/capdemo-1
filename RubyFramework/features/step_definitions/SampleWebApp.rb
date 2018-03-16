Given(/^User navigate to Simple Web Sheet Login Page$/) do
  visit WebSheetApp
end

When(/^User Sing In with Valid Credentials$/) do
  on(WebSheetApp).signIn

end

Then(/^User do some administrative work on Dashbord$/) do
  on(WebAppHomePage).dashbordAdmin
end

Then(/^User do some administrative work on Dashbord time frmae(.*)$/) do |timeframeoutline|
  on(WebAppHomePage).dashbordAdminOutline(timeframeoutline)
end

Given(/^the client authenticate with username and password$/) do
  $get_response = RestClient.get("http://opensource.demo.orangehrmlive.com/")

end


Then(/^User verify the response code$/) do
  expect($get_response.code).to eq(200)
  puts "Status Code For the Request:#{$get_response.code}"
end

Given(/^User Send A Get HTTP Request$/) do
  $get_response = RestClient.get("http://opensource.demo.orangehrmlive.com/")
end