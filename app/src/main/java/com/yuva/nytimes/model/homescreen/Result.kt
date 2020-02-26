package com.yuva.nytimes.model.homescreen

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Result{
    @SerializedName("uri")
    @Expose
    private var uri: String? = null
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("id")
    @Expose
    private var id: Long = 0
    @SerializedName("asset_id")
    @Expose
    private var assetId: Long = 0
    @SerializedName("source")
    @Expose
    private var source: String? = null
    @SerializedName("published_date")
    @Expose
    private var publishedDate: String? = null
    @SerializedName("updated")
    @Expose
    private var updated: String? = null
    @SerializedName("section")
    @Expose
    private var section: String? = null
    @SerializedName("subsection")
    @Expose
    private var subsection: String? = null
    @SerializedName("nytdsection")
    @Expose
    private var nytdsection: String? = null
    @SerializedName("adx_keywords")
    @Expose
    private var adxKeywords: String? = null
    @SerializedName("column")
    @Expose
    private var column: Any? = null
    @SerializedName("byline")
    @Expose
    private var byline: String? = null
    @SerializedName("type")
    @Expose
    private var type: String? = null
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("abstract")
    @Expose
    private var _abstract: String? = null
    @SerializedName("des_facet")
    @Expose
    private var desFacet: List<String>? = null
    @SerializedName("org_facet")
    @Expose
    private var orgFacet: List<String>? = null
    @SerializedName("per_facet")
    @Expose
    private var perFacet: List<String>? = null
    @SerializedName("geo_facet")
    @Expose
    private var geoFacet: List<String>? = null
    @SerializedName("media")
    @Expose
    private var media: List<Medium>? = null
    @SerializedName("eta_id")
    @Expose
    private var etaId: Long = 0

    fun getUri(): String? {
        return uri
    }

    fun setUri(uri: String) {
        this.uri = uri
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getId(): Long {
        return id
    }

    fun setId(id: Long) {
        this.id = id
    }

    fun getAssetId(): Long {
        return assetId
    }

    fun setAssetId(assetId: Long) {
        this.assetId = assetId
    }

    fun getSource(): String? {
        return source
    }

    fun setSource(source: String) {
        this.source = source
    }

    fun getPublishedDate(): String? {
        return publishedDate
    }

    fun setPublishedDate(publishedDate: String) {
        this.publishedDate = publishedDate
    }

    fun getUpdated(): String? {
        return updated
    }

    fun setUpdated(updated: String) {
        this.updated = updated
    }

    fun getSection(): String? {
        return section
    }

    fun setSection(section: String) {
        this.section = section
    }

    fun getSubsection(): String? {
        return subsection
    }

    fun setSubsection(subsection: String) {
        this.subsection = subsection
    }

    fun getNytdsection(): String? {
        return nytdsection
    }

    fun setNytdsection(nytdsection: String) {
        this.nytdsection = nytdsection
    }

    fun getAdxKeywords(): String? {
        return adxKeywords
    }

    fun setAdxKeywords(adxKeywords: String) {
        this.adxKeywords = adxKeywords
    }

    fun getColumn(): Any? {
        return column
    }

    fun setColumn(column: Any) {
        this.column = column
    }

    fun getByline(): String? {
        return byline
    }

    fun setByline(byline: String) {
        this.byline = byline
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getAbstract(): String? {
        return _abstract
    }

    fun setAbstract(_abstract: String) {
        this._abstract = _abstract
    }

    fun getDesFacet(): List<String>? {
        return desFacet
    }

    fun setDesFacet(desFacet: List<String>) {
        this.desFacet = desFacet
    }

    fun getOrgFacet(): List<String>? {
        return orgFacet
    }

    fun setOrgFacet(orgFacet: List<String>) {
        this.orgFacet = orgFacet
    }

    fun getPerFacet(): List<String>? {
        return perFacet
    }

    fun setPerFacet(perFacet: List<String>) {
        this.perFacet = perFacet
    }

    fun getGeoFacet(): List<String>? {
        return geoFacet
    }

    fun setGeoFacet(geoFacet: List<String>) {
        this.geoFacet = geoFacet
    }

    fun getMedia(): List<Medium>? {
        return media
    }

    fun setMedia(media: List<Medium>) {
        this.media = media
    }

    fun getEtaId(): Long {
        return etaId
    }

    fun setEtaId(etaId: Long) {
        this.etaId = etaId
    }
}