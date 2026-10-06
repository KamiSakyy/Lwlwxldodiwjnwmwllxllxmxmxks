package in;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.lifecycle.l1;
import com.github.service.models.ApiRequestStatus;
import com.google.android.gms.internal.measurement.i4;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 {
    public static final t0 Companion = new t0();
    public final q81.u a;
    public final v71.v b;
    public final oa.j c;
    public final oa.h d;
    public final qe.a e;
    public final q81.u f;
    public String g;
    public ZonedDateTime h;

    public a1(q81.u uVar, oa.j jVar, oa.h hVar, qe.a aVar) {
        c81.e eVar = v71.l0.a;
        c81.d dVar = c81.d.t;
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(dVar, "ioDispatcher");
        k71.k.g(jVar, "user");
        k71.k.g(hVar, "tokenManager");
        this.a = uVar;
        this.b = dVar;
        this.c = jVar;
        this.d = hVar;
        this.e = aVar;
        q81.t tVar = new q81.t();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        tVar.b(15L, timeUnit);
        tVar.a(15L, timeUnit);
        this.f = new q81.u(tVar);
        ZonedDateTime atZone = Instant.ofEpochMilli(Long.MIN_VALUE).atZone(ZoneId.systemDefault());
        k71.k.f(atZone, "atZone(...)");
        this.h = atZone;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        v0 v0Var;
        int i;
        a1 a1Var;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i2 = v0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = v0Var.v;
                b71.a aVar = b71.a.r;
                i = v0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    if (this.h.compareTo((ChronoZonedDateTime<?>) ZonedDateTime.now()) < 0) {
                        v0Var.u = this;
                        v0Var.x = 1;
                        obj = v71.b0.L(this.b, new com.github.rudroid.d0(this, (a71.c) null, 4), v0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                        a1Var = this;
                    }
                    return this.g;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1Var = v0Var.u;
                sy.y.j(obj);
                a1Var.g = (String) obj;
                ZonedDateTime plusHours = ZonedDateTime.now().plusHours(8L);
                k71.k.f(plusHours, "plusHours(...)");
                this.h = plusHours;
                return this.g;
            }
        }
        v0Var = new v0(this, cVar);
        Object obj2 = v0Var.v;
        b71.a aVar2 = b71.a.r;
        i = v0Var.x;
        if (i != 0) {
        }
        a1Var.g = (String) obj2;
        ZonedDateTime plusHours2 = ZonedDateTime.now().plusHours(8L);
        k71.k.f(plusHours2, "plusHours(...)");
        this.h = plusHours2;
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, ContentResolver contentResolver, List list, j71.c cVar, c71.c cVar2) {
        w0 w0Var;
        int i;
        String str5;
        String str6;
        String str7;
        String str8;
        List list2;
        j71.c cVar3 = cVar;
        if (cVar2 instanceof w0) {
            w0Var = (w0) cVar2;
            int i2 = w0Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0Var.B = i2 - Integer.MIN_VALUE;
                Object obj = w0Var.z;
                Object obj2 = b71.a.r;
                i = w0Var.B;
                if (i != 0) {
                    sy.y.j(obj);
                    w0Var.u = str;
                    w0Var.v = str2;
                    str5 = str3;
                    w0Var.w = str5;
                    w0Var.x = str4;
                    w0Var.y = cVar3;
                    w0Var.B = 1;
                    Object d = d(contentResolver, list, cVar3, w0Var);
                    if (d != obj2) {
                        str6 = str2;
                        str7 = str4;
                        obj = d;
                        str8 = str;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                cVar3 = w0Var.y;
                str7 = w0Var.x;
                str5 = w0Var.w;
                str6 = w0Var.v;
                str8 = w0Var.u;
                sy.y.j(obj);
                list2 = (List) obj;
                if (list2 != null) {
                    return ApiRequestStatus.FAILURE;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("subject", str6);
                jSONObject.put("comments", str5);
                if (!list2.isEmpty()) {
                    jSONObject.put("uploads", new JSONArray((Collection) list2));
                }
                q81.x xVar = q81.y.Companion;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("contact", jSONObject);
                jSONObject2.put("mobile_metadata", str7);
                String jSONObject3 = jSONObject2.toString();
                k71.k.f(jSONObject3, "toString(...)");
                t71.n nVar = q81.q.d;
                q81.q g0 = i4.g0("application/json; charset=utf-8");
                xVar.getClass();
                q81.w a = q81.x.a(jSONObject3, g0);
                l1 l1Var = new l1(11);
                l1Var.I("https://support.github.com/api/contact/mobile");
                l1Var.G(j0.class, new j0(true, true));
                l1Var.g("Authorization", "RemoteAuth " + str8);
                l1Var.g("Content-Type", "application/json");
                l1Var.g("Accept", "application/json");
                l1Var.A(a);
                x0 x0Var = new x0(this, new androidx.lifecycle.b(l1Var), cVar3, null, 0);
                w0Var.u = null;
                w0Var.v = null;
                w0Var.w = null;
                w0Var.x = null;
                w0Var.y = null;
                w0Var.B = 2;
                Object L = v71.b0.L(this.b, x0Var, w0Var);
                return L == obj2 ? obj2 : L;
            }
        }
        w0Var = new w0(this, cVar2);
        Object obj3 = w0Var.z;
        Object obj22 = b71.a.r;
        i = w0Var.B;
        if (i != 0) {
        }
        list2 = (List) obj3;
        if (list2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, ContentResolver contentResolver, List list, com.github.rudroid.support.u uVar, c71.c cVar) {
        y0 y0Var;
        int i;
        ContentResolver contentResolver2;
        List list2;
        j71.c cVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i2 = y0Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0Var.C = i2 - Integer.MIN_VALUE;
                y0 y0Var2 = y0Var;
                Object obj = y0Var2.A;
                Object obj2 = b71.a.r;
                i = y0Var2.C;
                if (i != 0) {
                    sy.y.j(obj);
                    y0Var2.u = str;
                    y0Var2.v = str2;
                    y0Var2.w = str3;
                    y0Var2.x = contentResolver;
                    y0Var2.y = list;
                    y0Var2.z = uVar;
                    y0Var2.C = 1;
                    Object a = a(y0Var2);
                    if (a != obj2) {
                        contentResolver2 = contentResolver;
                        obj = a;
                        list2 = list;
                        cVar2 = uVar;
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                j71.c cVar3 = y0Var2.z;
                List list3 = y0Var2.y;
                ContentResolver contentResolver3 = y0Var2.x;
                String str8 = y0Var2.w;
                str5 = y0Var2.v;
                String str9 = y0Var2.u;
                sy.y.j(obj);
                str6 = str8;
                str4 = str9;
                cVar2 = cVar3;
                list2 = list3;
                contentResolver2 = contentResolver3;
                str7 = (String) obj;
                if (str7 != null) {
                    return ApiRequestStatus.FAILURE;
                }
                y0Var2.u = null;
                y0Var2.v = null;
                y0Var2.w = null;
                y0Var2.x = null;
                y0Var2.y = null;
                y0Var2.z = null;
                y0Var2.C = 2;
                Object b = b(str7, str4, str5, str6, contentResolver2, list2, cVar2, y0Var2);
                return b == obj2 ? obj2 : b;
            }
        }
        y0Var = new y0(this, cVar);
        y0 y0Var22 = y0Var;
        Object obj3 = y0Var22.A;
        Object obj22 = b71.a.r;
        i = y0Var22.C;
        if (i != 0) {
        }
        str7 = (String) obj3;
        if (str7 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ac -> B:10:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContentResolver contentResolver, List list, j71.c cVar, c71.c cVar2) {
        z0 z0Var;
        int i;
        Iterator it;
        j71.c cVar3;
        List list2;
        int i2;
        if (cVar2 instanceof z0) {
            z0Var = (z0) cVar2;
            int i3 = z0Var.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z0Var.B = i3 - Integer.MIN_VALUE;
                Object obj = z0Var.z;
                b71.a aVar = b71.a.r;
                i = z0Var.B;
                a71.c cVar4 = null;
                if (i != 0) {
                    sy.y.j(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    cVar3 = cVar;
                    list2 = arrayList;
                    i2 = 1;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = z0Var.y;
                    it = z0Var.x;
                    list2 = z0Var.w;
                    j71.c cVar5 = z0Var.v;
                    ContentResolver contentResolver2 = z0Var.u;
                    sy.y.j(obj);
                    int i5 = i4;
                    cVar3 = cVar5;
                    contentResolver = contentResolver2;
                    String str = (String) obj;
                    if (str == null) {
                        list2.add(str);
                        i2 = i5;
                        if (it.hasNext()) {
                            return list2;
                        }
                        Uri uri = (Uri) it.next();
                        i5 = i2 + 1;
                        String valueOf = String.valueOf(i2);
                        z0Var.u = contentResolver;
                        z0Var.v = cVar3;
                        z0Var.w = list2;
                        z0Var.x = it;
                        z0Var.y = i5;
                        z0Var.B = 1;
                        u0 u0Var = new u0(contentResolver, uri);
                        l1 l1Var = new l1(11);
                        l1Var.I("https://github.zendesk.com/api/v2/uploads.json?filename=" + valueOf);
                        l1Var.g("Content-Type", "application/binary");
                        l1Var.g("Accept", "application/json");
                        l1Var.A(u0Var);
                        obj = v71.b0.L(this.b, new x0(this, new androidx.lifecycle.b(l1Var), cVar3, cVar4, 1), z0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                        String str2 = (String) obj;
                        if (str2 == null) {
                            return null;
                        }
                    }
                }
            }
        }
        z0Var = new z0(this, cVar2);
        Object obj2 = z0Var.z;
        b71.a aVar2 = b71.a.r;
        i = z0Var.B;
        a71.c cVar42 = null;
        if (i != 0) {
        }
    }
}
