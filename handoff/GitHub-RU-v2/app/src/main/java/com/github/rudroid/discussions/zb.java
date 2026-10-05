package com.github.rudroid.discussions;

import android.os.Bundle;
import com.github.domain.discussions.data.DiscussionCategoryData;

/* loaded from: /home/user/work/p/classes.dex */
public final class zb extends androidx.lifecycle.k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f12054s;

    /* renamed from: t, reason: collision with root package name */
    public final ik.r f12055t;

    /* renamed from: u, reason: collision with root package name */
    public final ik.p f12056u;

    /* renamed from: v, reason: collision with root package name */
    public final y71.y1 f12057v;

    /* renamed from: w, reason: collision with root package name */
    public final y71.i1 f12058w;

    /* renamed from: x, reason: collision with root package name */
    public final y71.y1 f12059x;

    /* renamed from: y, reason: collision with root package name */
    public final y71.i1 f12060y;

    public static final class a {
        public static void a(Bundle bundle, String str, String str2, String str3, String str4) {
            k71.k.g(str, "repositoryOwner");
            bundle.putString("EXTRA_REPO_OWNER", str);
            bundle.putString("EXTRA_REPO_NAME", str2);
            bundle.putString("EXTRA_FILTER_CATEGORY_SLUG", str3);
            bundle.putString("EXTRA_DEEPLINK_FILTER_QUERY", str4);
        }

        public static void b(Bundle bundle, String str, String str2, DiscussionCategoryData discussionCategoryData) {
            k71.k.g(str, "repositoryOwner");
            k71.k.g(str2, "repositoryName");
            bundle.putString("EXTRA_REPO_OWNER", str);
            bundle.putString("EXTRA_REPO_NAME", str2);
            bundle.putParcelable("EXTRA_FILTER_CATEGORY", discussionCategoryData);
        }
    }

    public zb(com.github.rudroid.activities.util.c cVar, ik.r rVar, ik.p pVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(rVar, "fetchDiscussionRepositoryNameUseCase");
        k71.k.g(pVar, "fetchDiscussionCategoryUseCase");
        this.f12054s = cVar;
        this.f12055t = rVar;
        this.f12056u = pVar;
        y71.y1 s2 = com.github.rudroid.m0.s(fl.f.Companion, null);
        this.f12057v = s2;
        this.f12058w = new y71.i1(s2);
        y71.y1 c10 = y71.n1.c(fl.e.b((Object) null));
        this.f12059x = c10;
        this.f12060y = new y71.i1(c10);
    }
}
