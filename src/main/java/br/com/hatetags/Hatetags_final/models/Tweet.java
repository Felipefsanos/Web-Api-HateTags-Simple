package br.com.hatetags.Hatetags_final.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tweet {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @NotNull
    private Long idTweet;

    @NotNull
    private String Name;

    @NotNull
    private String Text;
    private String Language;

    @Temporal(TemporalType.DATE)
    private Date Data;
    private String Image;
    private String Link;
    private Long Favorites;
    private Long Retweets;
    private Double Sentiment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTweet() {
        return idTweet;
    }

    public void setIdTweet(Long idTweet) {
        this.idTweet = idTweet;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public Long getFavorites() {
        return Favorites;
    }

    public void setFavorites(Long favorites) {
        Favorites = favorites;
    }

    public Long getRetweets() {
        return Retweets;
    }

    public void setRetweets(Long retweets) {
        Retweets = retweets;
    }

    public Double getSentiment() {
        return Sentiment;
    }

    public void setSentiment(Double sentiment) {
        Sentiment = sentiment;
    }
}
