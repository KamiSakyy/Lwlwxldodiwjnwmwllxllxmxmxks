package com.github.rudroid.searchandfilter.complexfilter.category;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.html.b;
import com.github.rudroid.searchandfilter.complexfilter.e0;
import ic.af;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends e0<a> {
    public final com.github.rudroid.searchandfilter.complexfilter.s f;
    public final com.github.rudroid.html.b g;

    public b(com.github.rudroid.searchandfilter.complexfilter.s sVar, com.github.rudroid.html.b bVar) {
        k71.k.g(bVar, "htmlStyler");
        this.f = sVar;
        this.g = bVar;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        a aVar = (a) obj;
        k71.k.g(aVar, "item");
        DiscussionCategoryData discussionCategoryData = aVar.a;
        k71.k.g(discussionCategoryData, "<this>");
        return discussionCategoryData.s;
    }

    public final void v(n1 n1Var, int i) {
        w wVar = (w) n1Var;
        a aVar = (a) this.d.get(i);
        k71.k.g(aVar, "item");
        af afVar = wVar.u;
        ((k5.f) afVar).A.setOnClickListener(new cd.n(10, wVar, aVar));
        TextView textView = afVar.O;
        k71.k.d(textView);
        DiscussionCategoryData discussionCategoryData = aVar.a;
        String str = discussionCategoryData.s;
        String str2 = discussionCategoryData.w;
        textView.setVisibility(!t71.p.T(str) ? 0 : 8);
        textView.setText(discussionCategoryData.s);
        TextView textView2 = afVar.N;
        k71.k.d(textView2);
        textView2.setVisibility(!t71.p.T(str2) ? 0 : 8);
        textView2.setText(str2);
        ImageView imageView = afVar.R;
        k71.k.f(imageView, "selectedIndicator");
        imageView.setVisibility(aVar.b ? 0 : 8);
        com.github.rudroid.html.b bVar = wVar.w;
        TextView textView3 = afVar.Q;
        k71.k.f(textView3, "discussionCategoryEmoji");
        com.github.rudroid.html.b.a(bVar, textView3, discussionCategoryData.t, (b.a) null, false, 40);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        af b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559260, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new w(b, this.f, this.g);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0<T1,T2,T3,T4> {
        public a0() {
        }
    }
}
