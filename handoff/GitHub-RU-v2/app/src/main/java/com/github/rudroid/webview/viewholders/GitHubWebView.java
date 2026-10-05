package com.github.rudroid.webview.viewholders;

import a0.s0;
import a81.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import com.github.rudroid.utilities.y2;
import com.github.rudroid.w;
import java.util.ArrayList;
import java.util.Objects;
import k71.x;
import org.json.JSONException;
import org.json.JSONObject;
import sy.y;
import t71.p;
import t71.q;
import v71.b0;
import v71.l0;
import v71.s1;
import v71.z;
import w61.a0;
import zh.h;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: /home/user/work/p/classes3.dex */
public class GitHubWebView extends j {
    public static final b Companion;
    public static final /* synthetic */ r71.e[] G;
    public d A;
    public zh.h B;
    public a C;
    public final com.github.rudroid.webview.viewholders.g D;
    public w E;
    public zh.g F;
    public com.github.rudroid.activities.util.c t;
    public final ia.d u;
    public final a81.d v;
    public boolean w;
    public boolean x;
    public boolean y;
    public c z;

    public interface a {
        f a();

        void b(int i, boolean z);

        boolean isEnabled();
    }

    public static final class b {
    }

    public interface c {
        void b(int i);
    }

    public interface d {
        void a(int i);
    }

    public interface e {
    }

    public static final class f {
        public final int a;
        public final boolean b;

        public f(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "TaskCheckbox(position=" + this.a + ", value=" + this.b + ")";
        }
    }

    public interface g {
        GitHubWebView e();
    }

    @c71.e(c = "com.github.rudroid.webview.viewholders.GitHubWebView$sendMessage$1", f = "GitHubWebView.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends c71.j implements j71.e {
        public final /* synthetic */ String v;
        public final /* synthetic */ GitHubWebView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, GitHubWebView gitHubWebView, a71.c cVar) {
            super(2, cVar);
            this.v = str;
            this.w = gitHubWebView;
        }

        public final a71.c r(a71.c cVar, Object obj) {
            return new h(this.v, this.w, cVar);
        }

        public final Object s(Object obj, Object obj2) {
            h r = r((a71.c) obj2, (z) obj);
            a0 a0Var = a0.a;
            r.v(a0Var);
            return a0Var;
        }

        public final Object v(Object obj) {
            a0 a0Var = a0.a;
            b71.a aVar = b71.a.r;
            y.j(obj);
            try {
                JSONObject jSONObject = new JSONObject(this.v);
                boolean has = jSONObject.has("id");
                Integer num = null;
                GitHubWebView gitHubWebView = this.w;
                if (!has) {
                    zh.g gVar = gitHubWebView.F;
                    if (gVar == null) {
                        k71.k.m("currentItem");
                        throw null;
                    }
                    jSONObject.put("id", gVar.E());
                }
                zh.g gVar2 = gitHubWebView.F;
                if (gVar2 == null) {
                    k71.k.m("currentItem");
                    throw null;
                }
                if (!k71.k.b(gVar2.E(), jSONObject.get("id"))) {
                    Objects.toString(jSONObject.get("id"));
                    return a0Var;
                }
                Object obj2 = jSONObject.get("messageName");
                if (k71.k.b(obj2, "scroll_to")) {
                    Object obj3 = jSONObject.get("posY");
                    Double d = obj3 instanceof Double ? (Double) obj3 : null;
                    if (d != null) {
                        num = new Integer((int) d.doubleValue());
                    } else {
                        Object obj4 = jSONObject.get("posY");
                        if (obj4 instanceof Integer) {
                            num = (Integer) obj4;
                        }
                    }
                    if (num != null) {
                        int a = y2.a(num.intValue());
                        d dVar = gitHubWebView.A;
                        if (dVar != null) {
                            dVar.a(a);
                            return a0Var;
                        }
                    }
                } else {
                    if (k71.k.b(obj2, "height")) {
                        Object obj5 = jSONObject.get("height");
                        k71.k.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                        gitHubWebView.b(((Integer) obj5).intValue());
                        return a0Var;
                    }
                    if (k71.k.b(obj2, "error")) {
                        IllegalStateException illegalStateException = new IllegalStateException("JavaScript error: " + jSONObject.optString("message"));
                        k71.k.f(jSONObject.toString(), "toString(...)");
                        r41.c.a().b(illegalStateException);
                        return a0Var;
                    }
                    if (k71.k.b(obj2, "task_changed")) {
                        a checkboxCheckedListener = gitHubWebView.getCheckboxCheckedListener();
                        if (checkboxCheckedListener == null) {
                            throw new IllegalStateException(("Unhandled javascript callback " + obj2).toString());
                        }
                        Object obj6 = jSONObject.get("taskPosition");
                        k71.k.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) obj6).intValue();
                        Object obj7 = jSONObject.get("taskChecked");
                        k71.k.e(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                        checkboxCheckedListener.b(intValue, ((Boolean) obj7).booleanValue());
                        return a0Var;
                    }
                    zh.h messageHandler = gitHubWebView.getMessageHandler();
                    if (messageHandler == null) {
                        throw new IllegalStateException(("Unhandled javascript callback " + obj2).toString());
                    }
                    k71.k.d(obj2);
                    h.a aVar2 = (h.a) messageHandler.a.get(obj2);
                    if (aVar2 != null) {
                        aVar2.a(jSONObject);
                    }
                }
                return a0Var;
            } catch (JSONException e) {
                b bVar = GitHubWebView.Companion;
                r41.c.a().b(e);
                return a0Var;
            }
        }
    }

    static {
        r71.e mVar = new k71.m(GitHubWebView.class, "scrollToAnchor", "getScrollToAnchor()Ljava/lang/String;", 0);
        x.a.getClass();
        G = new r71.e[]{mVar};
        Companion = new b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GitHubWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        k71.k.g(context, "context");
    }

    public final void a(String str) {
        k71.k.g(str, "anchor");
        zh.g gVar = this.F;
        if (gVar == null) {
            k71.k.m("currentItem");
            throw null;
        }
        if (p.I(gVar.G(), str, false)) {
            loadUrl("javascript:github.getAnchorPosition(\"" + str + "\")");
        }
    }

    public final void b(int i) {
        int W = m71.a.W(i * getResources().getDisplayMetrics().density);
        if (getLayoutParams().height != W) {
            int i2 = zh.e.a;
            zh.g gVar = this.F;
            if (gVar == null) {
                k71.k.m("currentItem");
                throw null;
            }
            int L = gVar.L();
            zh.g gVar2 = this.F;
            if (gVar2 == null) {
                k71.k.m("currentItem");
                throw null;
            }
            String id = gVar2.getId();
            k71.k.g(id, "id");
            zh.e.d.l(Integer.valueOf(L), Integer.valueOf(W));
            zh.e.e.l(id, Integer.valueOf(W));
            getLayoutParams().height = W;
            requestLayout();
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.requestLayout();
            }
        }
        if (this.y) {
            return;
        }
        this.y = true;
        c cVar = this.z;
        if (cVar != null) {
            cVar.b(W);
        }
        String scrollToAnchor = getScrollToAnchor();
        if (scrollToAnchor != null) {
            a(scrollToAnchor);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r3 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String str;
        f a2;
        zh.g gVar = this.F;
        if (gVar == null) {
            k71.k.m("currentItem");
            throw null;
        }
        String C = t71.w.C(t71.w.C(gVar.G(), "<a href=\"#", "<a href=\"github://github.com/?anchor="), "<a href=\"/", "<a href=\"uri://");
        zh.g gVar2 = this.F;
        if (gVar2 == null) {
            k71.k.m("currentItem");
            throw null;
        }
        String Q = gVar2.Q();
        if (Q != null) {
            C = t71.w.C(C, "<a href=\"" + Q + "#", "<a href=\"github://github.com/?anchor=");
        }
        String encode = Uri.encode(t71.w.C(t71.w.C(t71.w.C(C, "\\", "\\\\"), "\n", "\\n"), "\"", "\\\""));
        zh.g gVar3 = this.F;
        if (gVar3 == null) {
            k71.k.m("currentItem");
            throw null;
        }
        String E = gVar3.E();
        zh.h hVar = this.B;
        Boolean valueOf = hVar != null ? Boolean.valueOf(hVar.a.containsKey("commit_suggestion")) : null;
        a aVar = this.C;
        boolean z = false;
        if (aVar != null && aVar.isEnabled()) {
            z = true;
        }
        a aVar2 = this.C;
        if (aVar2 != null && (a2 = aVar2.a()) != null) {
            str = "\"" + a2.a + "\", \"" + a2.b + "\"";
        }
        str = "";
        StringBuilder o = s0.o("javascript:github.load(\"", E, "\", \"", encode, "\", ");
        o.append(valueOf);
        o.append(", ");
        o.append(z);
        o.append(", ");
        o.append(str);
        o.append(")");
        loadUrl(o.toString());
        evaluateJavascript(q.r("\n            document.querySelectorAll(\".user-mention[href$='/" + getAccountHolder().d().a + "']\").forEach(\n             function(element) {\n                 element.classList.add('user-mention-viewer')\n             }\n         )\n        "), new com.github.rudroid.webview.viewholders.c());
    }

    public final void d(zh.g gVar) {
        int intValue;
        k71.k.g(gVar, "item");
        this.F = gVar;
        this.y = false;
        int i = zh.e.a;
        int L = gVar.L();
        String id = gVar.getId();
        k71.k.g(id, "id");
        Integer num = (Integer) zh.e.d.h(Integer.valueOf(L));
        if (num != null) {
            intValue = num.intValue();
        } else {
            Integer num2 = (Integer) zh.e.e.h(id);
            intValue = num2 != null ? num2.intValue() : zh.e.a;
        }
        getLayoutParams().height = intValue;
        requestLayout();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestLayout();
        }
        if (this.w) {
            c();
        } else {
            this.x = true;
        }
    }

    public final com.github.rudroid.activities.util.c getAccountHolder() {
        com.github.rudroid.activities.util.c cVar = this.t;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final a getCheckboxCheckedListener() {
        return this.C;
    }

    public final w getDeepLinkRouter() {
        w wVar = this.E;
        if (wVar != null) {
            return wVar;
        }
        k71.k.m("deepLinkRouter");
        throw null;
    }

    public final zh.h getMessageHandler() {
        return this.B;
    }

    public final d getOnScrollListener() {
        return this.A;
    }

    public final String getScrollToAnchor() {
        return (String) this.D.t(this, G[0]);
    }

    public final c getWebViewLoadedListener() {
        return this.z;
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        k71.k.g(str, "payload");
        b0.z(this.v, (a71.h) null, (v71.a0) null, new h(str, this, null), 3);
    }

    public final void setAccountHolder(com.github.rudroid.activities.util.c cVar) {
        k71.k.g(cVar, "<set-?>");
        this.t = cVar;
    }

    public final void setCheckboxCheckedListener(a aVar) {
        this.C = aVar;
    }

    public final void setDeepLinkRouter(w wVar) {
        k71.k.g(wVar, "<set-?>");
        this.E = wVar;
    }

    public final void setMessageHandler(zh.h hVar) {
        this.B = hVar;
    }

    public final void setOnScrollListener(d dVar) {
        this.A = dVar;
    }

    public final void setScrollToAnchor(String str) {
        this.D.y(str, G[0]);
    }

    public final void setWebViewLoadedListener(c cVar) {
        this.z = cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GitHubWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        String str;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        k71.k.g(context, "context");
        if (!isInEditMode() && !this.s) {
            this.s = true;
            ((com.github.rudroid.webview.viewholders.h) w()).a(this);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new z4.b("/android_asset/webview/", new k8.a(context)));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z4.b bVar = (z4.b) obj;
            arrayList2.add(new k8.b((String) bVar.a, (k8.a) bVar.b));
        }
        this.u = new ia.d(arrayList2);
        s1 e2 = b0.e();
        c81.e eVar = l0.a;
        this.v = new a81.d(k21.f.y(e2, n.a));
        this.D = new com.github.rudroid.webview.viewholders.g(this);
        setBackgroundColor(Color.argb(1, 0, 0, 0));
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setOffscreenPreRaster(true);
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(this, "native");
        setWebViewClient(new com.github.rudroid.webview.viewholders.e(this));
        setWebChromeClient(new com.github.rudroid.webview.viewholders.f());
        Resources resources = getResources();
        k71.k.f(resources, "getResources(...)");
        if (rc.c.a(resources)) {
            str = zh.e.c;
            if (str == null) {
                k71.k.m("HTML_TEMPLATE_DARK");
                throw null;
            }
        } else {
            str = zh.e.b;
            if (str == null) {
                k71.k.m("HTML_TEMPLATE");
                throw null;
            }
        }
        loadDataWithBaseURL(null, str, "text/html", null, null);
    }
}
