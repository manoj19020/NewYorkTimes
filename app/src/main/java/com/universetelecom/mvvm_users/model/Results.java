package com.universetelecom.mvvm_users.model;

/**
 * Created by Ashish.Tamrakar on 6/14/2018.
 */

public class Results
{

    private String published_date;

    private String asset_id;

    private String geo_facet;

    private String[] per_facet;

    private String type;

    private String url;

    private String section;

    private String[] des_facet;

    private String id;

    private String title;

    private String byline;

    private String source;

    private String views;

    private String[] org_facet;

    private String column;

    private String adx_keywords;

    private Media[] media;

    public String getPublished_date ()
    {
        return published_date;
    }

    public void setPublished_date (String published_date)
    {
        this.published_date = published_date;
    }

    public String getAsset_id ()
    {
        return asset_id;
    }

    public void setAsset_id (String asset_id)
    {
        this.asset_id = asset_id;
    }

    public String getGeo_facet ()
    {
        return geo_facet;
    }

    public void setGeo_facet (String geo_facet)
    {
        this.geo_facet = geo_facet;
    }

    public String[] getPer_facet ()
    {
        return per_facet;
    }

    public void setPer_facet (String[] per_facet)
    {
        this.per_facet = per_facet;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getSection ()
    {
        return section;
    }

    public void setSection (String section)
    {
        this.section = section;
    }

    public String[] getDes_facet ()
    {
        return des_facet;
    }

    public void setDes_facet (String[] des_facet)
    {
        this.des_facet = des_facet;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getByline ()
    {
        return byline;
    }

    public void setByline (String byline)
    {
        this.byline = byline;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getViews ()
    {
        return views;
    }

    public void setViews (String views)
    {
        this.views = views;
    }

    public String[] getOrg_facet ()
    {
        return org_facet;
    }

    public void setOrg_facet (String[] org_facet)
    {
        this.org_facet = org_facet;
    }

    public String getColumn ()
{
    return column;
}

    public void setColumn (String column)
    {
        this.column = column;
    }

    public String getAdx_keywords ()
    {
        return adx_keywords;
    }

    public void setAdx_keywords (String adx_keywords)
    {
        this.adx_keywords = adx_keywords;
    }

    public Media[] getMedia ()
    {
        return media;
    }

    public void setMedia (Media[] media)
    {
        this.media = media;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [abstract = "+", published_date = "+published_date+", asset_id = "+asset_id+", geo_facet = "+geo_facet+", per_facet = "+per_facet+", type = "+type+", url = "+url+", section = "+section+", des_facet = "+des_facet+", id = "+id+", title = "+title+", byline = "+byline+", source = "+source+", views = "+views+", org_facet = "+org_facet+", column = "+column+", adx_keywords = "+adx_keywords+", media = "+media+"]";
    }
}
