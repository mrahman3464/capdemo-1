Given(/^User navigate to Simple Web Sheet Login Page "([^"]*)"$/) do |browser|
  ENV['WHERE']="remote"
  ENV['BROWSER']= browser
  ENV['BROWSER'] = "chrome" if ENV['BROWSER'].nil?
  ENV['WHERE'] = "local" if ENV['WHERE'].nil?
  if(ENV['WHERE']=="remote")

    @browser = SauceLabs.watir_browser(ENV['BROWSER'].to_sym,{url:"http://militim:ac90d57e-9e97-4f8f-b1d6-a5cabcb8e096@ondemand.saucelabs.com:80/wd/hub"})
  else
    @browser = SauceLabs.watir_browser(ENV['BROWSER'].to_sym)
  end
  @browser.window.maximize
  @browser.goto "http://opensource.demo.orangehrmlive.com/"
end


Given(/^User navigate to OrangeHRM Login Page "([^"]*)"$/) do |browser|
  ENV['WHERE']="remote"
  ENV['BROWSER']= browser
  ENV['BROWSER'] = "chrome" if ENV['BROWSER'].nil?
  ENV['WHERE'] = "local" if ENV['WHERE'].nil?
  if(ENV['WHERE']=="remote")

    @browser = SauceLabs.watir_browser(ENV['BROWSER'].to_sym,{url:"http://militim:ac90d57e-9e97-4f8f-b1d6-a5cabcb8e096@ondemand.saucelabs.com:80/wd/hub"})
  else
    @browser = SauceLabs.watir_browser(ENV['BROWSER'].to_sym)
  end
  @browser.window.maximize
  @browser.goto "http://opensource.demo.orangehrmlive.com/"
end