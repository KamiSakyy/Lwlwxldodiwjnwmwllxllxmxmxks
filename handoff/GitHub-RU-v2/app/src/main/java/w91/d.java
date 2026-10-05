package w91;

import a0.s0;
import h0.q1;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;
import s91.f;
import sy.a0;
import sy.d0;
import t71.n;
import t71.o;
import t71.w;
import w61.k;
import x61.l;
import x61.m;
import x61.r;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d implements u91.c {
    public static final List a;
    public static final n b;

    static {
        o oVar = o.s;
        List r = l.r(new k[]{new k(new n("<(?:script|pre|style)(?: |>|$)", oVar), new n("</(?:script|style|pre)>", oVar)), new k(new n("<!--"), new n("-->")), new k(new n("<\\?"), new n("\\?>")), new k(new n("<![A-Z]"), new n(">")), new k(new n("<!\\[CDATA\\["), new n("\\]\\]>")), new k(new n("</?(?:" + w.C("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|") + ")(?: |/?>|$)", oVar), (Object) null), new k(new n("(?:<[a-zA-Z][a-zA-Z0-9-]*(?:\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[a-zA-Z][a-zA-Z0-9-]*\\s*>)(?: |$)"), (Object) null)});
        a = r;
        b = new n(s0.m(new StringBuilder("^("), m.c0(r, "|", (String) null, (String) null, 0, c.s, 30), ')'));
    }

    public static int c(s91.c cVar, t91.d dVar) {
        k71.k.g(cVar, "pos");
        k71.k.g(dVar, "constraints");
        if (cVar.b != a0.l(dVar, cVar.d)) {
            return -1;
        }
        String b2 = cVar.b();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (i < b2.length() && b2.charAt(i) == ' ') {
                i++;
            }
        }
        if (i >= b2.length() || b2.charAt(i) != '<') {
            return -1;
        }
        t71.l a2 = b.a(b2.subSequence(i, b2.length()).toString());
        if (a2 == null) {
            return -1;
        }
        o1.l lVar = a2.c;
        int a3 = lVar.a();
        List list = a;
        if (a3 != list.size() + 2) {
            throw new MarkdownParsingException("There are some excess capturing groups probably!");
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (lVar.b(i3 + 2) != null) {
                return i3;
            }
        }
        throw new MarkdownParsingException("Match found but all groups are empty!");
    }

    @Override // u91.c
    public final boolean a(s91.c cVar, t91.d dVar) {
        k71.k.g(cVar, "pos");
        k71.k.g(dVar, "constraints");
        int c = c(cVar, dVar);
        return c >= 0 && c < 6;
    }

    @Override // u91.c
    public final List b(s91.c cVar, q1 q1Var, f fVar) {
        k71.k.g(fVar, "stateInfo");
        t91.d dVar = fVar.a;
        int c = c(cVar, dVar);
        return c != -1 ? d0.n(new v91.e(dVar, q1Var, (n) ((k) a.get(c)).s, cVar)) : r.r;
    }
}
