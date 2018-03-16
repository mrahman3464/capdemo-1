# #----------------------------------------------------------------------------------------------------------------------------
# get_response = RestClient.get( "https://applicationname-api-sbox02.herokuapp.com/api/v1/users",
#                                {
#                                    "Content-Type" => "application/json",
#                                    "Authorization" => "token 4d012314b7e46008f215cdb7d120cdd7",
#                                    "Manufacturer-Token" => "8d0693ccfe65104600e2555d5af34213"
#                                }
# )
#
#
#
#
# puts get_response.body
# if get_response.code == 200
#   puts "********* Get current user successful"
# else
#   puts "Get current user failed!!"
# end
#
#
# #---------------------------Parsing the Response Body----------------------------------------------------------------
#
# require 'minitest/autorun'
# require 'rest_client'
# require 'json'
#
# class APITest < MiniTest::Unit::TestCase
#   def setup
#     response = RestClient.get("https://applicationname-api-sbox02.herokuapp.com/api/v1/users",
#                               {
#                                   "Content-Type" => "application/json",
#                                   "Authorization" => "token 4d012314b7e46008f215cdb7d120cdd7",
#                                   "Manufacturer-Token" => "8d0693ccfe65104600e2555d5af34213"
#                               }
#     )
#     @data = JSON.parse response.body
#   end
#
#   def test_id_correct
#     assert_equal 4, @data['id']
#   end
# end
#
# #---------------------------------------------------------------------------------------
#
# it 'returns charge' do
#   get "/charges/#{charge.id}", '', headers
#
#   expect(response.status).to eq(200)
#   expect(response).to match_response_schema(:charge)
#   expect(response).to match_json(<<-JSON)
#   {
#     "id":"{id}",
#     "email": "{email}",
#     "ip": "127.0.0.1",
#     "amount": 10500,
#     "state": "captured",
#     "captured_amount": 10500,
#   }
#   JSON
# end
#
#
# #----------------------------------------------------------------------
# raise "the ID was #{id} instead of 4"
# #----------------------------------------------------------------------
