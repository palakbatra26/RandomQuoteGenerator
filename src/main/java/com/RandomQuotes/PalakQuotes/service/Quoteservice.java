package com.RandomQuotes.PalakQuotes.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class Quoteservice {
    public String sendQuote() {
        List<String> quoteList = List.of(
            "You don’t have to be great to start, but you have to start to be great. – Zig Ziglar",
            "Work like hell. I mean you just have to put in 80 to 100-hour weeks. – Elon Musk",
            "You miss 100% of the shots you don’t take. – Wayne Gretzky",
            "Do what you can, with what you have, where you are. – Theodore Roosevelt",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful. – Albert Schweitzer",
            "Dream big and dare to fail. – Norman Vaughan",
            "It does not matter how slowly you go as long as you do not stop. – Confucius",
            "Believe you can and you’re halfway there. – Theodore Roosevelt",
            "The only way to do great work is to love what you do. – Steve Jobs",
            "Difficulties in life are intended to make us better, not bitter. – Dan Reeves",
            "Your limitation—it’s only your imagination.",
            "Push yourself, because no one else is going to do it for you.",
            "Great things never come from comfort zones.",
            "Success doesn’t just find you. You have to go out and get it.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Don’t stop when you’re tired. Stop when you’re done.",
            "Wake up with determination. Go to bed with satisfaction.",
            "Do something today that your future self will thank you for.",
            "Little things make big days.",
            "It’s going to be hard, but hard does not mean impossible.",
            "Don’t wait for opportunity. Create it.",
            "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
            "The key to success is to focus on goals, not obstacles.",
            "Dream it. Believe it. Build it.",
            "Opportunities don’t happen, you create them. – Chris Grosser",
            "Success is not final, failure is not fatal: it is the courage to continue that counts. – Winston Churchill",
            "Hardships often prepare ordinary people for an extraordinary destiny. – C.S. Lewis",
            "Do what you feel in your heart to be right – for you’ll be criticized anyway. – Eleanor Roosevelt",
            "We are what we repeatedly do. Excellence, then, is not an act, but a habit. – Aristotle",
            "Act as if what you do makes a difference. It does. – William James",
            "Quality means doing it right when no one is looking. – Henry Ford",
            "Don’t be pushed around by the fears in your mind. Be led by the dreams in your heart. – Roy T. Bennett",
            "Work like there is someone working 24 hours a day to take it all away from you. – Mark Cuban",
            "Start where you are. Use what you have. Do what you can. – Arthur Ashe",
            "Nothing will work unless you do. – Maya Angelou",
            "Everything you’ve ever wanted is on the other side of fear. – George Addair",
            "Stay hungry, stay foolish. – Steve Jobs",
            "Change your thoughts and you change your world. – Norman Vincent Peale",
            "Only put off until tomorrow what you are willing to die having left undone. – Pablo Picasso",
            "Don’t let yesterday take up too much of today. – Will Rogers",
            "Our greatest glory is not in never falling, but in rising every time we fall. – Confucius",
            "It is never too late to be what you might have been. – George Eliot",
            "Your time is limited, so don’t waste it living someone else’s life. – Steve Jobs",
            "Be the change that you wish to see in the world. – Mahatma Gandhi",
            "I find that the harder I work, the more luck I seem to have. – Thomas Jefferson",
            "It always seems impossible until it’s done. – Nelson Mandela",
            "It’s not whether you get knocked down, it’s whether you get up. – Vince Lombardi",
            "If you want to fly, you have to give up the things that weigh you down. – Toni Morrison",
            "Doubt kills more dreams than failure ever will. – Suzy Kassem",
            "Your past does not equal your future. – Tony Robbins",
            "You must be the master of your own destiny. – Napoleon Hill",
            "Live as if you were to die tomorrow. Learn as if you were to live forever. – Mahatma Gandhi"
        );
        
        Random random = new Random();
        return quoteList.get(random.nextInt(quoteList.size()));
    }
}
