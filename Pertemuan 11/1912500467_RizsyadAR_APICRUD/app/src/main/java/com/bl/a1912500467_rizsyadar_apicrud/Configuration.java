package com.bl.a1912500467_rizsyadar_apicrud;

public class Configuration {
    private static final String BASE_URL = "https://62a1-111-94-69-94.ngrok.io";
    public static final String URL_ADD = BASE_URL + "/api/add.php";
    public static final String URL_GET_MHS = BASE_URL + "/api/detail.php?id=";
    public static final String URL_GET_ALL = BASE_URL + "/api/read.php";
    public static final String URL_UPDATE_MHS = BASE_URL + "/api/update.php";
    public static final String URL_DELETE_MHS = BASE_URL+ "/api/delete.php?id=";

    // Request to PHP
    public static final String KEY_MHS_ID       = "id";
    public static final String KEY_MHS_NAMA     = "nama";
    public static final String KEY_MHS_ALAMAT   = "alamat";
    public static final String KEY_MHS_JURUSAN  = "jurusan";

    // JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID      = "id";
    public static final String TAG_NAMA    = "nama";
    public static final String TAG_ALAMAT  = "alamat";
    public static final String TAG_JURUSAN = "jurusan";

    public static final String MHS_ID = "mhs_id";
}
