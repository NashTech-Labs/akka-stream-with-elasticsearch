package com.knoldus

import twitter4j.{Twitter, TwitterFactory}
import twitter4j.auth.AccessToken
import twitter4j.conf.ConfigurationBuilder

object TwitterClient {

  val factory = new TwitterFactory(new ConfigurationBuilder().build())

  lazy val twitterClient: Twitter = factory.getInstance()
  twitterClient.setOAuthConsumer(System.getProperty("TWITTER_CONSUMER_KEY"),
    System.getProperty("TWITTER_CONSUMER_SECRET"))
  twitterClient.setOAuthAccessToken(new AccessToken(System.getProperty("TWITTER_ACCESS_TOKEN"),
    System.getProperty("TWITTER_ACCESS_SECRET")))

}
