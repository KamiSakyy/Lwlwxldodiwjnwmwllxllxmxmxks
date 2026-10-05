package com.google.android.gms.measurement.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements Runnable {
    public final /* synthetic */ int r = 0;
    public final URL s;
    public final byte[] t;
    public final String u;
    public final Map v;
    public final Object w;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.s0 x;

    public v0(w0 w0Var, String str, URL url, byte[] bArr, Map map, u0 u0Var) {
        Objects.requireNonNull(w0Var);
        this.x = w0Var;
        c21.u.d(str);
        c21.u.g(url);
        this.s = url;
        this.t = bArr;
        this.w = u0Var;
        this.u = str;
        this.v = map;
    }

    public void a(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((x2) this.x)).s).x;
        o1.m(m1Var);
        m1Var.I(new Runnable() { // from class: com.google.android.gms.measurement.internal.w2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                v0 v0Var = v0.this;
                ((v2) v0Var.w).b(v0Var.u, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:177:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:174:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i2;
        Map map2;
        Throwable th;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        HttpURLConnection httpURLConnection2;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Throwable th2;
        Map map10;
        IOException iOException2;
        ?? r8;
        ?? r82;
        Map map11;
        InputStream inputStream2;
        ?? hasNext;
        switch (this.r) {
            case 0:
                String str = this.u;
                w0 w0Var = (w0) this.x;
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) w0Var).s;
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) w0Var).s;
                m1 m1Var = o1Var.x;
                o1.m(m1Var);
                m1Var.D();
                OutputStream outputStream = null;
                try {
                    URLConnection openConnection = this.s.openConnection();
                    if (!(openConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    o1Var2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map12 = this.v;
                        if (map12 != null) {
                            for (Map.Entry entry : map12.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = this.t;
                        if (bArr != null) {
                            w0 w0Var2 = w0Var.t.x;
                            o4.U(w0Var2);
                            byte[] l0 = w0Var2.l0(bArr);
                            s0 s0Var = o1Var2.w;
                            o1.m(s0Var);
                            q0 q0Var = s0Var.F;
                            int length = l0.length;
                            q0Var.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream2 = httpURLConnection.getOutputStream();
                            try {
                                outputStream2.write(l0);
                                outputStream2.close();
                            } catch (IOException e) {
                                iOException = e;
                                i2 = 0;
                                map2 = null;
                                outputStream = outputStream2;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                u0 u0Var = (u0) this.w;
                                m1 m1Var2 = o1Var2.x;
                                o1.m(m1Var2);
                                m1Var2.I(new p0(this.u, u0Var, i2, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                i = 0;
                                map = null;
                                outputStream = outputStream2;
                                th = th;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                u0 u0Var2 = (u0) this.w;
                                m1 m1Var3 = o1Var2.x;
                                o1.m(m1Var3);
                                m1Var3.I(new p0(this.u, u0Var2, i, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        }
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (IOException e2) {
                        iOException = e2;
                        i2 = 0;
                        map2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        i = 0;
                        map = null;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream = null;
                            }
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        u0 u0Var3 = (u0) this.w;
                                        m1 m1Var4 = o1Var2.x;
                                        o1.m(m1Var4);
                                        m1Var4.I(new p0(this.u, u0Var3, responseCode, (IOException) null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            i2 = responseCode;
                            map2 = map4;
                            iOException = e;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e4) {
                                    s0 s0Var2 = o1Var2.w;
                                    o1.m(s0Var2);
                                    s0Var2.x.c("Error closing HTTP compressed POST connection output stream. appId", s0.H(str), e4);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            u0 u0Var4 = (u0) this.w;
                            m1 m1Var22 = o1Var2.x;
                            o1.m(m1Var22);
                            m1Var22.I(new p0(this.u, u0Var4, i2, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            i = responseCode;
                            map = map3;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e5) {
                                    s0 s0Var3 = o1Var2.w;
                                    o1.m(s0Var3);
                                    s0Var3.x.c("Error closing HTTP compressed POST connection output stream. appId", s0.H(str), e5);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            u0 u0Var22 = (u0) this.w;
                            m1 m1Var32 = o1Var2.x;
                            o1.m(m1Var32);
                            m1Var32.I(new p0(this.u, u0Var22, i, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        map2 = null;
                        i2 = responseCode;
                        iOException = e;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        u0 u0Var42 = (u0) this.w;
                        m1 m1Var222 = o1Var2.x;
                        o1.m(m1Var222);
                        m1Var222.I(new p0(this.u, u0Var42, i2, iOException, (byte[]) null, map2));
                        return;
                    } catch (Throwable th8) {
                        th = th8;
                        map = null;
                        i = responseCode;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        u0 u0Var222 = (u0) this.w;
                        m1 m1Var322 = o1Var2.x;
                        o1.m(m1Var322);
                        m1Var322.I(new p0(this.u, u0Var222, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    i2 = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    i = 0;
                    httpURLConnection = null;
                    map = null;
                }
            default:
                String str2 = this.u;
                x2 x2Var = (x2) this.x;
                o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) x2Var).s;
                o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) x2Var).s;
                m1 m1Var5 = o1Var3.x;
                o1.m(m1Var5);
                m1Var5.D();
                try {
                    URLConnection openConnection2 = this.s.openConnection();
                    if (!(openConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) openConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    o1Var4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map13 = this.v;
                            if (map13 != null) {
                                Iterator it = map13.entrySet().iterator();
                                while (true) {
                                    hasNext = it.hasNext();
                                    if (hasNext != 0) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                }
                            }
                            byte[] bArr3 = this.t;
                            map11 = hasNext;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    s0 s0Var4 = o1Var4.w;
                                    o1.m(s0Var4);
                                    q0 q0Var2 = s0Var4.F;
                                    int length2 = byteArray2.length;
                                    q0Var2.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    ?? outputStream3 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream3.write(byteArray2);
                                        outputStream3.close();
                                        map11 = outputStream3;
                                    } catch (IOException e8) {
                                        e = e8;
                                        i3 = 0;
                                        map8 = null;
                                        map10 = outputStream3;
                                        iOException2 = e;
                                        r82 = map10;
                                        if (r82 != 0) {
                                        }
                                        if (httpURLConnection2 != null) {
                                        }
                                        a(i3, iOException2, null, map8);
                                        return;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        i3 = 0;
                                        map7 = null;
                                        map9 = outputStream3;
                                        th2 = th;
                                        r8 = map9;
                                        if (r8 != 0) {
                                        }
                                        if (httpURLConnection2 != null) {
                                        }
                                        a(i3, null, null, map7);
                                        throw th2;
                                    }
                                } catch (IOException e9) {
                                    s0 s0Var5 = o1Var4.w;
                                    o1.m(s0Var5);
                                    s0Var5.x.b(e9, "Failed to gzip post request content");
                                    throw e9;
                                }
                            }
                            i3 = httpURLConnection2.getResponseCode();
                        } catch (IOException e10) {
                            e = e10;
                            i3 = 0;
                            map6 = null;
                            map8 = map6;
                            map10 = map6;
                            iOException2 = e;
                            r82 = map10;
                            if (r82 != 0) {
                                try {
                                    r82.close();
                                } catch (IOException e12) {
                                    s0 s0Var6 = o1Var4.w;
                                    o1.m(s0Var6);
                                    s0Var6.x.c("Error closing HTTP compressed POST connection output stream. appId", s0.H(str2), e12);
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            a(i3, iOException2, null, map8);
                            return;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        i3 = 0;
                        map5 = null;
                        map7 = map5;
                        map9 = map5;
                        th2 = th;
                        r8 = map9;
                        if (r8 != 0) {
                            try {
                                r8.close();
                            } catch (IOException e13) {
                                s0 s0Var7 = o1Var4.w;
                                o1.m(s0Var7);
                                s0Var7.x.c("Error closing HTTP compressed POST connection output stream. appId", s0.H(str2), e13);
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        a(i3, null, null, map7);
                        throw th2;
                    }
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr4 = new byte[1024];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr4);
                                        if (read2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            a(i3, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr4, 0, read2);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e14) {
                            iOException2 = e14;
                            map8 = map11;
                            r82 = 0;
                            if (r82 != 0) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            a(i3, iOException2, null, map8);
                            return;
                        } catch (Throwable th14) {
                            th2 = th14;
                            map7 = map11;
                            r8 = 0;
                            if (r8 != 0) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            a(i3, null, null, map7);
                            throw th2;
                        }
                    } catch (IOException e15) {
                        iOException2 = e15;
                        r82 = 0;
                        map8 = null;
                        if (r82 != 0) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        a(i3, iOException2, null, map8);
                        return;
                    } catch (Throwable th15) {
                        th2 = th15;
                        r8 = 0;
                        map7 = null;
                        if (r8 != 0) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        a(i3, null, null, map7);
                        throw th2;
                    }
                } catch (IOException e16) {
                    e = e16;
                    i3 = 0;
                    httpURLConnection2 = null;
                    map6 = null;
                } catch (Throwable th16) {
                    th = th16;
                    i3 = 0;
                    httpURLConnection2 = null;
                    map5 = null;
                }
        }
    }

    public v0(x2 x2Var, String str, URL url, byte[] bArr, HashMap hashMap, v2 v2Var) {
        Objects.requireNonNull(x2Var);
        this.x = x2Var;
        c21.u.d(str);
        this.s = url;
        this.t = bArr;
        this.w = v2Var;
        this.u = str;
        this.v = hashMap;
    }
}
