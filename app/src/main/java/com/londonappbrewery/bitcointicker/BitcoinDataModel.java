package com.londonappbrewery.bitcointicker;


import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel{

    private String mAverage;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){

        try{

            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            double avResult = jsonObject.getJSONObject("averages").getDouble("day");

            bitcoinData.mAverage = Double.toString(avResult);

            return bitcoinData;
        }
        catch (JSONException e){

            e.printStackTrace();
            return null;
        }

    }

    public String getAverage() {
        return mAverage;
    }
}
