Given(/^User navigate to OrangeHRM Login Page$/) do
  visit OrangeHRMLogInPage
end

When(/^User Login to the application$/) do
  on(OrangeHRMLogInPage).logIn("Admin","admin")
end