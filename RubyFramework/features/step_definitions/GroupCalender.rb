Given(/^User navigate to Group Calender App Login Page$/) do
  visit GroupCalendarApp
end

When(/^User Sing In to Group Calender app with Valid Credentials$/) do
  on(GroupCalendarApp).signIn
end

Then(/^User with Admin access Add a Calender$/) do
  on(GroupCalenderHome).gotoCalenderPage
  on(CalendarsPage).addCalender
end