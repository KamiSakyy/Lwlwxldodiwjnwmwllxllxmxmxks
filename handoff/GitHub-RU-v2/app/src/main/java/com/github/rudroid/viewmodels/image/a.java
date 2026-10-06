package com.github.rudroid.viewmodels.image;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.searchandfilter.complexfilter.user.assignee.l;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.utilities.g2;
import com.github.rudroid.utilities.h2;
import in.f0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k71.k;
import k71.m;
import k71.x;
import v71.a0;
import v71.b0;
import v71.v;
import x61.r;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends k1 {
    public static final C0014a Companion;
    public static final /* synthetic */ r71.e[] z;
    public v s;
    public q10.c t;
    public com.github.rudroid.activities.util.c u;
    public g2 v;
    public AtomicInteger w;
    public y1 x;
    public i1 y;

    /* renamed from: com.github.rudroid.viewmodels.image.a$a, reason: collision with other inner class name */
    public static final class C0014a {
        public static void a(String str, Bundle bundle) {
            k.g(str, "subjectId");
            bundle.putString("EXTRA_SUBJECT_ID", str);
        }
    }

    static {
        r71.e mVar = new m(a.class, "subjectId", "getSubjectId()Ljava/lang/String;", 0);
        x.a.getClass();
        z = new r71.e[]{mVar};
        Companion = new C0014a();
    }

    public a(v vVar, q10.c cVar, com.github.rudroid.activities.util.c cVar2, a1 a1Var) {
        k.g(vVar, "defaultDispatcher");
        k.g(cVar, "imageUploadClientForUserFactory");
        k.g(cVar2, "accountHolder");
        k.g(a1Var, "savedStateHandle");
        this.s = vVar;
        this.t = cVar;
        this.u = cVar2;
        this.v = h2.b(a1Var, "EXTRA_SUBJECT_ID", new u0(17), new l(25));
        this.w = new AtomicInteger(0);
        y1 c = n1.c(r.r);
        this.x = c;
        this.y = new i1(c);
    }

    public final boolean P() {
        return this.w.get() > 0;
    }

    public final void Q(f0 f0Var) {
        k.g(f0Var, "fileUploadStatus");
        y1 y1Var = this.x;
        y1Var.k((Object) null, x61.m.j0((Iterable) y1Var.getValue(), f0Var));
    }

    public final void R(ContentResolver contentResolver, List list) {
        k.g(list, "uris");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S(contentResolver, (Uri) it.next());
        }
    }

    public final void S(ContentResolver contentResolver, Uri uri) {
        k.g(uri, "uri");
        this.w.incrementAndGet();
        b0.z(d1.k(this), this.s, (a0) null, new c(this, contentResolver, uri, null), 2);
    }
}
