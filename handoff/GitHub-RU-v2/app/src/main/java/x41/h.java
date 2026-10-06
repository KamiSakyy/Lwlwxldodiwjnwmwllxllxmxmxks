package x41;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public static final Charset b = Charset.forName("UTF-8");
    public b51.d a;

    public h(b51.d dVar) {
        this.a = dVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(n.a(jSONArray.getString(i)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(n.a.o(list.get(i))));
            } catch (JSONException unused) {
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map c(String str, boolean z) {
        FileInputStream fileInputStream;
        b51.d dVar = this.a;
        File f = z ? dVar.f(str, "internal-keys") : dVar.f(str, "keys");
        if (!f.exists() || f.length() == 0) {
            if (f.exists() && f.delete()) {
                f.getAbsolutePath();
            }
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(f);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            HashMap a = a(v41.g.i(fileInputStream));
            v41.g.b(fileInputStream);
            return a;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            f(f);
            v41.g.b(fileInputStream2);
            return Collections.EMPTY_MAP;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            v41.g.b(fileInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File f = this.a.f(str, "user-data");
        Closeable closeable = null;
        if (f.exists()) {
            int r0 = (int) ((f.length() > 0L ? 1 : (f.length() == 0L ? 0 : -1)));
            try {
                if (r0 != 0) {
                    try {
                        fileInputStream = new FileInputStream(f);
                        try {
                            JSONObject jSONObject = new JSONObject(v41.g.i(fileInputStream));
                            String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            v41.g.b(fileInputStream);
                            return optString;
                        } catch (Exception unused) {
                            f(f);
                            v41.g.b(fileInputStream);
                            return null;
                        }
                    } catch (Exception unused2) {
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        v41.g.b(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r0;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        f(f);
        return null;
    }

    public final void g(String str, Map map, boolean z) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        b51.d dVar = this.a;
        File f = z ? dVar.f(str, "internal-keys") : dVar.f(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), b));
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            v41.g.b(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            f(f);
            v41.g.b(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            v41.g.b(bufferedWriter2);
            throw th;
        }
    }
}
