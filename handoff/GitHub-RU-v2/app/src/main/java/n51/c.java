package n51;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                d dVar = this.b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.a.get();
                        ArrayList d = hVar.d();
                        hVar.c();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < d.size(); i++) {
                            a aVar = (a) d.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.b;
                synchronized (dVar2) {
                    ((h) dVar2.a.get()).i(((y51.b) dVar2.c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
