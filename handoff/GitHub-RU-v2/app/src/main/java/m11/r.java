package m11;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.view.contentcapture.ContentCaptureSession;
import c21.u;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import y31.w;
import y41.e0;
import y41.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class r implements j11.g, p51.a, p41.d, w21.d, t11.g, w21.a, m51.a, j11.e, w, z41.b {
    public final /* synthetic */ int r;

    public /* synthetic */ r(int i) {
        this.r = i;
    }

    private final void d(p51.b bVar) {
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession i(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // z41.b
    public Object a(JsonReader jsonReader) {
        String str = null;
        switch (this.r) {
            case 28:
                jsonReader.beginObject();
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName) {
                        case "libraryName":
                            str2 = jsonReader.nextString();
                            if (str2 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case "arch":
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                        case "buildId":
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new e0(str, str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" arch");
                }
                if (str2 == null) {
                    sb.append(" libraryName");
                }
                if (str3 == null) {
                    sb.append(" buildId");
                }
                throw new IllegalStateException(no.a.n("Missing required properties:", sb));
            default:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("filename")) {
                        str = jsonReader.nextString();
                        if (str == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (nextName2.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new h0(str, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                throw new IllegalStateException(no.a.n("Missing required properties:", sb2));
        }
    }

    @Override // t11.g, j11.e
    public Object apply(Object obj) {
        switch (this.r) {
            case 14:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        l51.h a = j.a();
                        a.J(rawQuery.getString(1));
                        a.u = w11.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a.t = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a.i());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                x51.e eVar = (x51.e) obj;
                l51.h hVar = w51.o.a;
                hVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hVar.n(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // j11.g
    public void b(Exception exc) {
    }

    @Override // w21.a
    public Object c(w21.o oVar) {
        int i;
        Object obj;
        switch (this.r) {
            case 19:
                i = 403;
                break;
            case 20:
                i = -1;
                break;
            default:
                synchronized (oVar.a) {
                    u.i("Task is not yet complete", oVar.c);
                    if (oVar.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(oVar.f)) {
                        throw ((Throwable) IOException.class.cast(oVar.f));
                    }
                    Exception exc = oVar.f;
                    if (exc != null) {
                        throw new RuntimeExecutionException(exc);
                    }
                    obj = oVar.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // p41.d
    public Object f(androidx.lifecycle.b bVar) {
        q51.d lambda$getComponents$0;
        switch (this.r) {
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 9:
                p41.k kVar = ExecutorsRegistrar.a;
                return q41.k.r;
            case 10:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(bVar);
                return lambda$getComponents$0;
            default:
                Set g = bVar.g(p41.o.a(y51.a.class));
                y51.c cVar = y51.c.t;
                if (cVar == null) {
                    synchronized (y51.c.class) {
                        try {
                            cVar = y51.c.t;
                            if (cVar == null) {
                                cVar = new y51.c(0);
                                y51.c.t = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new y51.b(g, cVar);
        }
    }

    @Override // w21.d
    public void h(Exception exc) {
    }

    @Override // p51.a
    public void k(p51.b bVar) {
        switch (this.r) {
            case 1:
                return;
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    public static Object e(Object... a) {
        return null;
    }

    public static Object g(Object... a) {
        return null;
    }

    public static Object j(Object... a) {
        return null;
    }

    public static Object l(Object... a) {
        return null;
    }

    public static Object m(Object... a) {
        return null;
    }
}
