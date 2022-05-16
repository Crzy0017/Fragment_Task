package com.example.newsfragment

import java.io.Serializable

data class NewsList(val header: String, val author: String, val content: String): Serializable

object Data {
    val new: Array<NewsList> = arrayOf(
        NewsList(
            "UK government sets out plans to rein in Big Tech",
            "By James Clayton",
            "Large tech companies such as Google and Facebook will have to abide by new competition rules in the UK or risk facing huge fines, the government said."
        ),
        NewsList(
            "Uber loses $5.9bn as Asia investment values fall",
            "By Peter Hoskins",
            "Ride-hailing and delivery group Uber has made a \$5.9bn (£4.7bn) loss, mostly due to its stakes in other companies."
        ),
        NewsList(
            "Bill Gates on Elon Musk feud and Jeffrey Epstein meetings",
            "By James Clayton",
            "In a wide-ranging interview with the BBC's Today programme, Bill Gates says conspiracy theories about him are \"crazy\" and that being shouted at in public is \"awful\". He also told the BBC's Mishal Husain that meeting Jeffrey Epstein was a \"mistake\" and talks about Elon Musk's recent public criticism of him."
        ),
        NewsList(
            "Ukraine war: Investigation finds hundreds of fake charity websites",
            "By Angus Crawford & Tony Smith",
            "Online scammers have been using hundreds of fake charity websites to trick people wanting to donate to Ukraine, a BBC investigation has found."
        ),
        NewsList(
            "Gucci stores to accept cryptocurrencies in US",
            "By Ali Abibulla",
            "Italian luxury brand Gucci will start accepting payments in cryptocurrencies in some of its stores in America.Customers will be able to pay using a number of cryptocurrencies, including Bitcoin, Ethereum and Litecoin."
        ),
        NewsList(
            "Elon Musk lines up $7bn backing for Twitter deal",
            "By Harvey Specter",
            "Billionaire Elon Musk has lined up 19 new investors to help with his $44bn (£35.5bn) purchase of Twitter. The commitments, totalling $7.1bn, will allow Mr Musk to reduce his own risk in the deal which has been approved by Twitter's board but not completed. Oracle co-founder and Mr Musk's friend, Larry Ellison, is the single biggest contributor with $1bn."
        )
    )
}
