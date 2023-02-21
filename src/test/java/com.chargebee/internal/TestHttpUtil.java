package com.chargebee.internal;

import com.chargebee.*;
import com.chargebee.exceptions.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.zip.GZIPInputStream;
import org.apache.commons.codec.binary.Base64;
import org.json.*;
import org.junit.Before;
import org.junit.Test;

public class TestHttpUtil {
    HttpUtil httpUtil;

    @Before
    public void before() {
        HttpUtil  httpUtil = new HttpUtil();
    }

    @Test
    public void testCreateQuery() throws Exception {
       Params params = new Params();
        params.add("a", "b");
        //assertEquals("a=b", httpUtil.toQueryStr(params));
    }

}
