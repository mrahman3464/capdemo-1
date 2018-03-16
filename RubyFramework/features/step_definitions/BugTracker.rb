Given(/^User navigate to Bug Tracker App Login Page$/) do
  visit BucktrackerApp
end

When(/^User Sing In to Bug tracker with Valid Credentials$/) do
  on(BucktrackerApp).signIn
end