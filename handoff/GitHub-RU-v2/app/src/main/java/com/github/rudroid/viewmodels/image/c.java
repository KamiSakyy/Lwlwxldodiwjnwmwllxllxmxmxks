package com.github.rudroid.viewmodels.image;

import android.content.ContentResolver;
import android.net.Uri;
import c00.m;
import c71.j;
import com.github.rudroid.common.e;
import com.github.rudroid.common.i;
import com.github.service.models.ApiRequestStatus;
import com.google.android.gms.internal.measurement.i4;
import in.m0;
import in.n0;
import in.t;
import k71.k;
import q81.u;
import t00.f8;
import v71.z;
import w61.a0;
import y71.n1;
import y71.s;
import y71.y;

@c71.e(c = "com.github.rudroid.viewmodels.image.MediaUploadViewModel$uploadMedia$1", f = "MediaUploadViewModel.kt", l = {60}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends j implements j71.e {
    public int v;
    public final /* synthetic */ a w;
    public final /* synthetic */ ContentResolver x;
    public final /* synthetic */ Uri y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContentResolver contentResolver, Uri uri, a71.c cVar) {
        super(2, cVar);
        this.w = aVar;
        this.x = contentResolver;
        this.y = uri;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        y f8Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            a aVar2 = this.w;
            q10.c cVar = aVar2.t;
            oa.j d = aVar2.u.d();
            cVar.getClass();
            n0 n0Var = new n0((u) cVar.a.a(d), d, cVar.b);
            ContentResolver contentResolver = this.x;
            String str = (String) aVar2.v.a(aVar2, a.z[0]);
            Uri uri = this.y;
            k.g(uri, "uri");
            k.g(str, "subjectId");
            e.a aVar3 = com.github.rudroid.common.e.Companion;
            String authority = uri.getAuthority();
            if (authority == null) {
                authority = "no authority";
            }
            aVar3.getClass();
            i c = e.a.c(authority);
            qe.a aVar4 = n0Var.d;
            aVar4.f(c);
            a71.c cVar2 = null;
            try {
                t H = i4.H(contentResolver, uri);
                f8Var = new y(n1.y(new s(new f8(new m0(null, H, n0Var, str)), new cn.f(n0Var, cVar2, 3)), n0Var.b), new m(n0Var, H, cVar2, 7));
            } catch (Throwable th2) {
                aVar4.b("MediaFileUpload", th2, true);
                k.g("failure : " + th2, "errorMessage");
                f8Var = new f8(21, new in.a0(ApiRequestStatus.FAILURE, "", null));
            }
            b bVar = new b(aVar2);
            this.v = 1;
            if (f8Var.b(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return a0.a;
    }
    public Object v(Object) { return null; }
}
