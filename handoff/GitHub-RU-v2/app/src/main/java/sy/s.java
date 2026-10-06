package sy;

import a0.s0;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.fragment.NavHostFragment;
import c21.h0;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import com.google.firebase.messaging.FirebaseMessaging;
import dw.q0;
import dw.r0;
import e50.g0;
import e50.l0;
import gn0.kx;
import hc0.ev;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import org.xmlpull.v1.XmlPullParserException;
import vb0.s6;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s {
    public static final ExecutorService a(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new v8.d(z));
        k71.k.f(newFixedThreadPool, "newFixedThreadPool(...)");
        return newFixedThreadPool;
    }

    public static final boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (k71.k.h(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r5.j(r7, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(com.github.service.wrapper.b bVar, j71.c cVar, c71.c cVar2) {
        s6 s6Var;
        int i;
        ca0.f fVar;
        if (cVar2 instanceof s6) {
            s6Var = (s6) cVar2;
            int i2 = s6Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s6Var.x = i2 - Integer.MIN_VALUE;
                Object obj = s6Var.w;
                b71.a aVar = b71.a.r;
                i = s6Var.x;
                if (i != 0) {
                    y.j(obj);
                    ca0.i iVar = new ca0.i();
                    s6Var.u = bVar;
                    s6Var.v = cVar;
                    s6Var.x = 1;
                    obj = bVar.f(iVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = s6Var.v;
                    bVar = s6Var.u;
                    y.j(obj);
                }
                fVar = (ca0.f) obj;
                if (fVar != null) {
                    ca0.h hVar = fVar.a;
                    ca0.f fVar2 = new ca0.f(new ca0.h(hVar.a, new ca0.g(((Number) cVar.k(new Integer(hVar.b.a))).intValue()), hVar.c));
                    ca0.i iVar2 = new ca0.i();
                    s6Var.u = null;
                    s6Var.v = null;
                    s6Var.x = 2;
                }
                return w61.a0.a;
            }
        }
        s6Var = new s6(cVar2);
        Object obj2 = s6Var.w;
        b71.a aVar2 = b71.a.r;
        i = s6Var.x;
        if (i != 0) {
        }
        fVar = (ca0.f) obj2;
        if (fVar != null) {
        }
        return w61.a0.a;
    }

    public static final b01.j d(e50.xShadow xVar) {
        g0 g0Var;
        i80.c cVar = xVar.l;
        com.github.service.models.response.a c = t.e.c(xVar.c.b.b);
        l0 l0Var = xVar.k;
        e50.d0 d0Var = l0Var.q;
        String str = (d0Var == null || (g0Var = d0Var.b) == null) ? "" : g0Var.a;
        b01.b b = t.b(l0Var);
        String str2 = str;
        String str3 = xVar.d;
        String str4 = xVar.e;
        String str5 = l0Var.l;
        ArrayList f = c0.f(cVar, l0Var.b);
        boolean z = cVar.c;
        boolean z2 = xVar.j;
        boolean z3 = xVar.f == ev.w;
        boolean z4 = xVar.g;
        boolean z5 = xVar.h;
        g70.a aVar = xVar.m;
        return new b01.j(c, str2, b, str3, str4, str5, f, z, z2, z3, z4, z5, aVar.b, aVar.c);
    }

    public static final bb0.g e(u60.a aVar) {
        if (aVar != null) {
            return new bb0.g(aVar.b, aVar.c, b31.b.h0(aVar.d), (int) aVar.e, aVar.f);
        }
        return null;
    }

    public static final h01.j f(q0 q0Var) {
        k71.k.g(q0Var, "<this>");
        String str = q0Var.a;
        String str2 = q0Var.b;
        int i = q0Var.d;
        CloseReason w = w.w(q0Var.f);
        IssueState O = i21.a.O(q0Var.g);
        r0 r0Var = q0Var.e;
        return new h01.j(str, str2, q0Var.c, i, w, O, r0Var.c.b, r0Var.b);
    }

    public static x6.l0 g(TypedValue typedValue, x6.l0 l0Var, x6.l0 l0Var2, String str, String str2) {
        if (l0Var == null || l0Var == l0Var2) {
            return l0Var == null ? l0Var2 : l0Var;
        }
        StringBuilder o = s0.o("Type is ", str, " but found ", str2, ": ");
        o.append(typedValue.data);
        throw new XmlPullParserException(o.toString());
    }

    public static boolean h() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            k41.g.c();
            k41.g c = k41.g.c();
            c.a();
            context = c.a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static final x6.a0 i(androidx.fragment.app.a0 a0Var) {
        Dialog u4;
        Window window;
        k71.k.g(a0Var, "<this>");
        for (androidx.fragment.app.a0 a0Var2 = a0Var; a0Var2 != null; a0Var2 = a0Var2.P) {
            if (a0Var2 instanceof NavHostFragment) {
                return ((NavHostFragment) a0Var2).s4();
            }
            NavHostFragment navHostFragment = a0Var2.A3().A;
            if (navHostFragment instanceof NavHostFragment) {
                return navHostFragment.s4();
            }
        }
        View view = a0Var.a0;
        if (view != null) {
            return u.f(view);
        }
        View view2 = null;
        DialogFragment dialogFragment = a0Var instanceof DialogFragment ? (DialogFragment) a0Var : null;
        if (dialogFragment != null && (u4 = dialogFragment.u4()) != null && (window = u4.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return u.f(view2);
        }
        throw new IllegalStateException(s0.j("Fragment ", a0Var, " does not have a NavController set"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:14|(1:16)|17|(1:19)(39:116|(2:119|120)|118|21|(5:104|105|106|107|108)|23|24|(1:26)(1:103)|27|28|(29:30|(1:96)|32|(1:34)(1:(1:94)(25:95|36|(1:38)|39|(1:41)(1:92)|42|(1:46)|(1:48)(1:91)|49|(1:51)(1:90)|52|(1:54)(1:89)|55|(1:57)(1:88)|58|(5:84|85|67|(1:69)(1:71)|70)|60|(5:80|81|67|(0)(0)|70)|62|63|(1:65)(6:73|(2:76|(1:78))|75|67|(0)(0)|70)|66|67|(0)(0)|70))|35|36|(0)|39|(0)(0)|42|(2:44|46)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70)|97|(1:99)(3:100|(1:102)|32)|(0)(0)|35|36|(0)|39|(0)(0)|42|(0)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70)|20|21|(0)|23|24|(0)(0)|27|28|(0)|97|(0)(0)|(0)(0)|35|36|(0)|39|(0)(0)|42|(0)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164 A[Catch: NumberFormatException -> 0x0172, TRY_ENTER, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0172, blocks: (B:65:0x0164, B:78:0x017e), top: B:63:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(Intent intent) {
        m11.q qVar;
        int parseInt;
        int i;
        String string;
        String string2;
        char c;
        int i2;
        int i3;
        String string3;
        x51.d string4;
        long parseLong;
        String str;
        String str2;
        if (o(intent)) {
            l("_nr", intent.getExtras());
        }
        if (!((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : h()) || (qVar = (j11.f) FirebaseMessaging.l.get()) == null) {
            return;
        }
        x51.d dVar = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Object obj = extras.get("google.ttl");
            if (obj instanceof Integer) {
                parseInt = ((Integer) obj).intValue();
            } else {
                if (obj instanceof String) {
                    try {
                        parseInt = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        k41.g c2 = k41.g.c();
                        try {
                            Object obj2 = q51.c.m;
                            string = (String) t.q.c(((q51.c) c2.b(q51.d.class)).c());
                        } catch (InterruptedException e) {
                            e = e;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        e = e2;
                    }
                }
                String str3 = string;
                k41.g c3 = k41.g.c();
                c3.a();
                String packageName = c3.a.getPackageName();
                x51.b bVar = !s21.a.p(extras) ? x51.b.t : x51.b.s;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string2 = extras.getString("google.priority");
                    }
                    c = 2;
                    if (c == 2) {
                        i3 = 5;
                    } else if (c == 1) {
                        i3 = 10;
                    } else {
                        i2 = 0;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str4 = string3 == null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            dVar = string4;
                        }
                        String str5 = dVar == null ? dVar : "";
                        String string5 = extras.getString("collapse_key");
                        String str6 = string5 == null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str7 = string6 == null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str8 = string7 == null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException unused2) {
                            }
                            dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i2, i, str5, str7, str8);
                        }
                        k41.g c4 = k41.g.c();
                        k41.i iVar = c4.c;
                        c4.a();
                        str = iVar.e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException unused3) {
                            }
                            dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i2, i, str5, str7, str8);
                        }
                        c4.a();
                        str2 = iVar.b;
                        if (str2.startsWith("1:")) {
                            parseLong = Long.parseLong(str2);
                        } else {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str9 = split[1];
                                if (!str9.isEmpty()) {
                                    parseLong = Long.parseLong(str9);
                                }
                            }
                            parseLong = 0;
                            dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i2, i, str5, str7, str8);
                        }
                        dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i2, i, str5, str7, str8);
                    }
                    i2 = i3;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 == null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        dVar = string4;
                    }
                    if (dVar == null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 == null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 == null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 == null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    k41.g c42 = k41.g.c();
                    k41.i iVar2 = c42.c;
                    c42.a();
                    str = iVar2.e;
                    if (str != null) {
                    }
                    c42.a();
                    str2 = iVar2.b;
                    if (str2.startsWith("1:")) {
                    }
                    dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i2, i, str5, str7, str8);
                }
                if ("high".equals(string2)) {
                    if (!"normal".equals(string2)) {
                        c = 0;
                    }
                    c = 2;
                } else {
                    c = 1;
                }
                if (c == 2) {
                }
                i2 = i3;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 == null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (dVar == null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 == null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 == null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 == null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                k41.g c422 = k41.g.c();
                k41.i iVar22 = c422.c;
                c422.a();
                str = iVar22.e;
                if (str != null) {
                }
                c422.a();
                str2 = iVar22.b;
                if (str2.startsWith("1:")) {
                }
                dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i2, i, str5, str7, str8);
            }
            i = parseInt;
            string = extras.getString("google.to");
            if (TextUtils.isEmpty(string)) {
            }
            String str32 = string;
            k41.g c32 = k41.g.c();
            c32.a();
            String packageName2 = c32.a.getPackageName();
            x51.b bVar2 = !s21.a.p(extras) ? x51.b.t : x51.b.s;
            string2 = extras.getString("google.delivered_priority");
            if (string2 == null) {
            }
            if ("high".equals(string2)) {
            }
            if (c == 2) {
            }
            i2 = i3;
            string3 = extras.getString("google.message_id");
            if (string3 == null) {
            }
            if (string3 == null) {
            }
            string4 = extras.getString("from");
            if (string4 != null) {
            }
            if (dVar == null) {
            }
            String string5222 = extras.getString("collapse_key");
            if (string5222 == null) {
            }
            String string6222 = extras.getString("google.c.a.m_l");
            if (string6222 == null) {
            }
            String string7222 = extras.getString("google.c.a.c_l");
            if (string7222 == null) {
            }
            if (extras.containsKey("google.c.sender.id")) {
            }
            k41.g c4222 = k41.g.c();
            k41.i iVar222 = c4222.c;
            c4222.a();
            str = iVar222.e;
            if (str != null) {
            }
            c4222.a();
            str2 = iVar222.b;
            if (str2.startsWith("1:")) {
            }
            dVar = new x51.d(parseLong > 0 ? parseLong : 0L, str4, str32, bVar2, packageName2, str6, i2, i, str5, str7, str8);
        }
        if (dVar == null) {
            return;
        }
        try {
            qVar.a("FCM_CLIENT_EVENT_LOGGING", new j11.c("proto"), new m11.r(23)).D(new j11.a(new x51.e(dVar), j11.d.r, new j11.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new m11.r(0));
        } catch (RuntimeException unused4) {
        }
    }

    public static void l(String str, Bundle bundle) {
        try {
            k41.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = s21.a.p(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            m41.b bVar = (m41.a) k41.g.c().b(m41.a.class);
            if (bVar != null) {
                bVar.a("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static x91.d m(b21.v vVar) {
        int i;
        h0 h0Var;
        k71.k.g(vVar, "iterator");
        h0 m = vVar.m();
        h0 h0Var2 = j91.a.M;
        if (!k71.k.b(m, h0Var2)) {
            return null;
        }
        int i2 = vVar.s;
        ArrayList arrayList = new ArrayList();
        b21.v c = vVar.c();
        int i3 = -239;
        int i4 = -239;
        while (true) {
            h0 m2 = c.m();
            i = c.s;
            h0Var = j91.a.N;
            if (k71.k.b(m2, h0Var) || c.m() == null) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new q71.g(i4, i3, 1));
                }
                i4 = i;
            }
            if (k71.k.b(c.m(), h0Var2)) {
                i3 = i;
                break;
            }
            c = c.c();
            i3 = i;
        }
        if (!k71.k.b(c.m(), h0Var) || i == i2 + 1) {
            return null;
        }
        List n = d0.n(new x91.e(new q71.g(i2, i + 1, 1), j91.a.n));
        if (i4 != -239) {
            arrayList.add(new q71.g(i4, i3, 1));
        }
        return new x91.d(c, n, d0.n(arrayList));
    }

    public static x91.d n(b21.v vVar) {
        int i;
        h0 h0Var = j91.a.N;
        k71.k.g(vVar, "iterator");
        h0 m = vVar.m();
        h0 h0Var2 = j91.a.M;
        if (!k71.k.b(m, h0Var2)) {
            return null;
        }
        int i2 = vVar.s;
        ArrayList arrayList = new ArrayList();
        b21.v c = vVar.c();
        int i3 = -239;
        int i4 = -239;
        int i5 = 1;
        while (true) {
            h0 m2 = c.m();
            i = c.s;
            if (m2 == null || (k71.k.b(c.m(), h0Var) && i5 - 1 == 0)) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new q71.g(i4, i3, 1));
                }
                i4 = i;
            }
            if (k71.k.b(c.m(), h0Var2)) {
                i5++;
            }
            c = c.c();
            i3 = i;
        }
        if (!k71.k.b(c.m(), h0Var)) {
            return null;
        }
        List n = d0.n(new x91.e(new q71.g(i2, i + 1, 1), j91.a.q));
        if (i4 != -239) {
            arrayList.add(new q71.g(i4, i3, 1));
        }
        return new x91.d(c, n, d0.n(arrayList));
    }

    public static boolean o(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final kx p(TrendingPeriod trendingPeriod) {
        int i = trendingPeriod == null ? -1 : vl0.q.a[trendingPeriod.ordinal()];
        if (i == -1) {
            return kx.v;
        }
        if (i == 1) {
            return kx.s;
        }
        if (i == 2) {
            return kx.t;
        }
        if (i == 3) {
            return kx.u;
        }
        if (i == 4) {
            return kx.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract String j();
    public static Object A() { return null; }
    public Object A(Object p1) { return null; }
    public Object C() { return null; }
    public Object N() { return null; }
    public Object V() { return null; }
    public Object X() { return null; }
    public Object a0() { return null; }
    public Object d0(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public static ArrayList h(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object q0() { return null; }
    public Object r() { return null; }
    public Object t() { return null; }
    public Object S = null;
    public Object a = null;
    public Object d(int p1) { return null; }
    public Object d0(int p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(boolean p1) { return null; }
}
