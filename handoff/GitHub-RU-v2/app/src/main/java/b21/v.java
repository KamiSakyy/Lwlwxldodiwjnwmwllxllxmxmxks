package b21;

import a5.n1;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import c21.h0;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h0.q1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import x9.w;
import x9.z;

/* loaded from: /home/user/work/p/classes4.dex */
public class v implements b5.o {
    public final /* synthetic */ int r;
    public int s;
    public Object t;

    public static void i(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = k71.k.h(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public k.g A() {
        k.g h = h();
        h.show();
        return h;
    }

    public void B(String str) {
        k71.k.g(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        k(this.s, length);
        str.getChars(0, str.length(), (char[]) this.t, this.s);
        this.s += length;
    }

    public String C(a4 a4Var) {
        switch (this.r) {
            case 12:
                x9.c cVar = (x9.c) this.t;
                cVar.u(new v2.t(cVar, a4Var, false, 16), this.s);
                return "reconnectIfNeeded";
            default:
                w wVar = (w) this.t;
                int i = this.s;
                try {
                    if (wVar.G == null) {
                        throw null;
                    }
                    com.google.android.gms.internal.play_billing.g gVar = wVar.G;
                    String packageName = wVar.E.getPackageName();
                    String str = i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
                    IBinder vVar = new x9.v(a4Var);
                    com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                    Parcel N = eVar.N();
                    N.writeString(packageName);
                    N.writeString(str);
                    int i2 = com.google.android.gms.internal.play_billing.d.a;
                    N.writeStrongBinder(vVar);
                    try {
                        eVar.g.transact(1, N, null, 1);
                        N.recycle();
                        return "billingOverrideService.getBillingOverride";
                    } catch (Throwable th) {
                        N.recycle();
                        throw th;
                    }
                } catch (Exception unused) {
                    wVar.I(95, 28, z.r);
                    com.google.android.gms.internal.play_billing.t.h("BillingClientTesting");
                    a4Var.a(0);
                    return "billingOverrideService.getBillingOverride";
                }
        }
    }

    public void a(long j) {
        if (g(j)) {
            return;
        }
        int i = this.s;
        long[] jArr = (long[]) this.t;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            k71.k.f(jArr, "copyOf(...)");
            this.t = jArr;
        }
        jArr[i] = j;
        if (i >= this.s) {
            this.s = i + 1;
        }
    }

    public boolean b(View view) {
        ((BottomSheetBehavior) this.t).I(this.s);
        return true;
    }

    public v c() {
        return new v((x91.c) this.t, this.s + 1, 14);
    }

    public char d(int i) {
        x91.c cVar = (x91.c) this.t;
        if (i == 0) {
            return cVar.a(o(0).b);
        }
        if (i == -1) {
            return cVar.a(o(0).b - 1);
        }
        if (i != 1) {
            return cVar.a(i > 0 ? o(i).b : o(i + 1).b - 1);
        }
        return cVar.a(o(0).c);
    }

    public void e() {
        WeakReference weakReference;
        this.s = 0;
        Iterator it = ((LinkedHashMap) this.t).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                p9.e eVar = (p9.e) x61.m.W(arrayList);
                if (((eVar == null || (weakReference = eVar.b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((p9.e) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public synchronized void f() {
        this.s = 0;
        ((LinkedHashMap) this.t).clear();
    }

    public boolean g(long j) {
        int i = this.s;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.t)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.widget.ListAdapter] */
    public k.g h() {
        android.widget.ListAdapter r2;
        k.d dVar = (k.d) this.t;
        ContextThemeWrapper contextThemeWrapper = dVar.a;
        ContextThemeWrapper contextThemeWrapper2 = dVar.a;
        k.g gVar = new k.g(contextThemeWrapper, this.s);
        View view = dVar.e;
        k.f fVar = gVar.x;
        if (view != null) {
            fVar.w = view;
        } else {
            CharSequence charSequence = dVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.c;
            if (drawable != null) {
                fVar.s = drawable;
                ImageView imageView = fVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.f;
        if (charSequence2 != null) {
            fVar.e = charSequence2;
            TextView textView2 = fVar.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = dVar.g;
        if (charSequence3 != null) {
            fVar.c(-1, charSequence3, dVar.h);
        }
        CharSequence charSequence4 = dVar.i;
        if (charSequence4 != null) {
            fVar.c(-2, charSequence4, dVar.j);
        }
        CharSequence charSequence5 = dVar.k;
        if (charSequence5 != null) {
            fVar.c(-3, charSequence5, dVar.l);
        }
        if (dVar.n != null || dVar.o != null) {
            AlertController.RecycleListView inflate = dVar.b.inflate(fVar.A, (ViewGroup) null);
            if (dVar.s) {
                r2 = new k.a(dVar, contextThemeWrapper2, fVar.B, dVar.n, inflate);
            } else {
                int i = dVar.t ? fVar.C : fVar.D;
                Object obj = dVar.o;
                r2 = obj;
                if (obj == null) {
                    r2 = new k.e(contextThemeWrapper2, i, R.id.text1, dVar.n);
                }
            }
            fVar.x = r2;
            fVar.y = dVar.u;
            if (dVar.p != null) {
                inflate.setOnItemClickListener(new k.b(dVar, fVar));
            } else if (dVar.v != null) {
                inflate.setOnItemClickListener(new k.c(dVar, inflate, fVar));
            }
            if (dVar.t) {
                inflate.setChoiceMode(1);
            } else if (dVar.s) {
                inflate.setChoiceMode(2);
            }
            fVar.f = inflate;
        }
        View view2 = dVar.q;
        if (view2 != null) {
            fVar.g = view2;
            fVar.h = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        p.m mVar = dVar.m;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    public void j(h0 h0Var) {
        k71.k.g(h0Var, "type");
        q1 q1Var = (q1) this.t;
        q1Var.b.add(new x91.e(new q71.g(this.s, q1Var.a, 1), h0Var));
    }

    public void k(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.t;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] copyOf = Arrays.copyOf(cArr, i3);
            k71.k.f(copyOf, "copyOf(...)");
            this.t = copyOf;
        }
    }

    public int l() {
        return o(0).c - o(0).b;
    }

    public h0 m() {
        return o(0).a;
    }

    public void n(int i, h91.d dVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            h91.d dVar2 = ((h91.d[]) this.t)[i2];
            k71.k.d(dVar2);
            if (k71.k.i(0L, dVar.g - dVar2.g) <= 0) {
                break;
            }
            dVar2.f = i;
            ((h91.d[]) this.t)[i] = dVar2;
            i = i2;
        }
        ((h91.d[]) this.t)[i] = dVar;
        dVar.f = i;
    }

    public r91.b o(int i) {
        x91.c cVar = (x91.c) this.t;
        int i2 = this.s;
        if (i2 < 0) {
            int i3 = ((q71.e) ((q71.g) cVar.d)).r;
            return new r91.b((h0) null, i3, i3, 0, 0);
        }
        if (i2 > ((ArrayList) cVar.b).size()) {
            int i4 = ((q71.e) ((q71.g) cVar.d)).s;
            return new r91.b((h0) null, i4 + 1, i4 + 1, 0, 0);
        }
        int size = (i2 < ((ArrayList) cVar.b).size() ? ((r91.b) ((ArrayList) cVar.b).get(i2)).d : ((ArrayList) cVar.a).size()) + i;
        if (size < 0) {
            int i5 = ((q71.e) ((q71.g) cVar.d)).r;
            return new r91.b((h0) null, i5, i5, 0, 0);
        }
        if (size < ((ArrayList) cVar.a).size()) {
            return (r91.b) ((ArrayList) cVar.a).get(size);
        }
        int i6 = ((q71.e) ((q71.g) cVar.d)).s;
        return new r91.b((h0) null, i6 + 1, i6 + 1, 0, 0);
    }

    public void p(androidx.sqlite.db.framework.b bVar, int i, int i2) {
        ((g4.f) this.t).k(new x7.a(bVar), i, i2);
    }

    public y71.i q(aa.d dVar) {
        k71.k.g(dVar, "request");
        int i = this.s;
        y61.b bVar = (y61.b) this.t;
        if (i < bVar.a()) {
            return ((com.apollographql.apollo.interceptor.b) bVar.get(i)).a(dVar, new v(bVar, i + 1, 1));
        }
        throw new IllegalStateException("Check failed.");
    }

    public h0 r() {
        return o(1).a;
    }

    public void s() {
        m81.c cVar = m81.c.t;
        char[] cArr = (char[]) this.t;
        cVar.getClass();
        k71.k.g(cArr, "array");
        synchronized (cVar) {
            int i = ((n1) cVar).r;
            if (cArr.length + i < m81.b.a) {
                ((n1) cVar).r = i + cArr.length;
                ((x61.k) ((n1) cVar).s).addLast(cArr);
            }
        }
    }

    public void t(long j) {
        int i = this.s;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.t)[i2]) {
                int i3 = this.s - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.t;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.s--;
                return;
            }
            i2++;
        }
    }

    public String toString() {
        switch (this.r) {
            case 6:
                return new String((char[]) this.t, 0, this.s);
            case 14:
                return "Iterator: " + this.s + ": " + m();
            default:
                return super.toString();
        }
    }

    public void u(h91.d dVar) {
        h91.d dVar2;
        int i = dVar.f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.s;
        h91.d dVar3 = ((h91.d[]) this.t)[i2];
        k71.k.d(dVar3);
        dVar.f = -1;
        ((h91.d[]) this.t)[i2] = null;
        this.s = i2 - 1;
        if (dVar == dVar3) {
            return;
        }
        int i3 = k71.k.i(0L, dVar3.g - dVar.g);
        if (i3 == 0) {
            ((h91.d[]) this.t)[i] = dVar3;
            dVar3.f = i;
            return;
        }
        if (i3 >= 0) {
            n(i, dVar3);
            return;
        }
        while (true) {
            int i4 = i << 1;
            int i5 = i4 + 1;
            int i6 = this.s;
            if (i5 > i6) {
                if (i4 > i6) {
                    break;
                }
                dVar2 = ((h91.d[]) this.t)[i4];
                k71.k.d(dVar2);
            } else {
                dVar2 = ((h91.d[]) this.t)[i4];
                k71.k.d(dVar2);
                h91.d dVar4 = ((h91.d[]) this.t)[i5];
                k71.k.d(dVar4);
                if (k71.k.i(0L, dVar4.g - dVar2.g) >= 0) {
                    dVar2 = dVar4;
                }
            }
            if (k71.k.i(0L, dVar2.g - dVar3.g) <= 0) {
                break;
            }
            int i7 = dVar2.f;
            dVar2.f = i;
            ((h91.d[]) this.t)[i] = dVar2;
            i = i7;
        }
        ((h91.d[]) this.t)[i] = dVar3;
        dVar3.f = i;
    }

    public synchronized void v(p9.a aVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.t;
            Object obj = linkedHashMap.get(aVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(aVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            p9.e eVar = new p9.e(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(eVar);
                    break;
                }
                p9.e eVar2 = (p9.e) arrayList.get(i2);
                if (i < eVar2.d) {
                    i2++;
                } else if (eVar2.a == identityHashCode && eVar2.b.get() == bitmap) {
                    arrayList.set(i2, eVar);
                } else {
                    arrayList.add(i2, eVar);
                }
            }
            int i3 = this.s;
            this.s = i3 + 1;
            if (i3 >= 10) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void w(int i, DialogInterface.OnClickListener onClickListener) {
        k.d dVar = (k.d) this.t;
        dVar.i = dVar.a.getText(i);
        dVar.j = onClickListener;
    }

    public void x(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        k.d dVar = (k.d) this.t;
        dVar.i = charSequence;
        dVar.j = onClickListener;
    }

    public void y(int i, DialogInterface.OnClickListener onClickListener) {
        k.d dVar = (k.d) this.t;
        dVar.g = dVar.a.getText(i);
        dVar.h = onClickListener;
    }

    public void z(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        k.d dVar = (k.d) this.t;
        dVar.g = charSequence;
        dVar.h = onClickListener;
    }

    public /* synthetic */ v(Object obj, int i, int i2) {
        this.r = i2;
        this.t = obj;
        this.s = i;
    }

    public v(z11.b bVar, int i) {
        this.r = 0;
        c21.u.g(bVar);
        this.t = bVar;
        this.s = i;
    }

    public v(q1 q1Var) {
        this.r = 10;
        this.t = q1Var;
        this.s = q1Var.a;
    }

    public v() {
        this.r = 8;
        this.t = new LinkedHashMap();
    }

    public v(g4.f fVar, int i) {
        this.r = 5;
        this.t = fVar;
        this.r = 5;
        this.s = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Context context) {
        this(context, k.g.g(context, 0));
        this.r = 4;
    }

    public v(Context context, int i) {
        this.r = 4;
        this.t = new k.d(new ContextThemeWrapper(context, k.g.g(context, i)));
        this.s = i;
    }
}
