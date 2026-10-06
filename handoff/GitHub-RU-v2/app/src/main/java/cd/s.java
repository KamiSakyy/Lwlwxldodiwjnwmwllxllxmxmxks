package cd;

import ad.a;
import android.view.View;
import com.github.rudroid.adapters.viewholders.o3;
import com.github.service.models.response.type.PatchStatus;
import ic.w5;

/* loaded from: /home/user/work/p/classes.dex */
public final class s extends com.github.rudroid.adapters.viewholders.e<k5.f> implements o3 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f4231x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.interfaces.r f4232v;

    /* renamed from: w, reason: collision with root package name */
    public final a f4233w;

    public interface a {
        void D2(String str, String str2, String str3, String str4);

        void S(String str);

        void S2(String str, String str2, String str3, String str4);

        void f1(String str, String str2, String str3);

        void x0(String str, String str2, PatchStatus patchStatus);

        void z0(String str, String str2);
    }

    public s(w5 w5Var, com.github.rudroid.interfaces.r rVar, a aVar) {
        super(w5Var);
        this.f4232v = rVar;
        this.f4233w = aVar;
    }

    @Override // com.github.rudroid.adapters.viewholders.o3
    public final View c() {
        View view = this.f6016u.A;
        k71.k.f(view, "getRoot(...)");
        return view;
    }

    @Override // com.github.rudroid.adapters.viewholders.o3
    public final void d(int i) {
        this.f6016u.A.getLayoutParams().width = i;
    }

    public final void y(a.g gVar, com.github.rudroid.settings.codeoptions.f fVar) {
        k71.k.g(gVar, "item");
        k71.k.g(fVar, "codeOptions");
        k5.f fVar2 = this.f6016u;
        k71.k.e(fVar2, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemComposeViewContainerBinding");
        ((w5) fVar2).N.setContent(new r1.d(new r(this, gVar, fVar, 0), true, 1042615786));
    }

}
