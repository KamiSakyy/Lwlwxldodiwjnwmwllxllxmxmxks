package cd;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ic.a9;

/* loaded from: /home/user/work/p/classes.dex */
public final class x implements r9.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a9 f4243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a9 f4244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a9 f4245c;

    public x(a9 a9Var, a9 a9Var2, a9 a9Var3) {
        this.f4243a = a9Var;
        this.f4244b = a9Var2;
        this.f4245c = a9Var3;
    }

    @Override // r9.j
    public final void a() {
        a9 a9Var = this.f4244b;
        TextView textView = a9Var.P;
        k71.k.f(textView, "loadRichDiff");
        textView.setVisibility(0);
        ImageView imageView = a9Var.O;
        k71.k.f(imageView, "image");
        imageView.setVisibility(8);
        ProgressBar progressBar = a9Var.Q;
        k71.k.f(progressBar, "progress");
        progressBar.setVisibility(8);
    }

    @Override // r9.j
    public final void onCancel() {
        a9 a9Var = this.f4243a;
        TextView textView = a9Var.P;
        k71.k.f(textView, "loadRichDiff");
        textView.setVisibility(0);
        ImageView imageView = a9Var.O;
        k71.k.f(imageView, "image");
        imageView.setVisibility(8);
        ProgressBar progressBar = a9Var.Q;
        k71.k.f(progressBar, "progress");
        progressBar.setVisibility(8);
    }

    @Override // r9.j
    public final void onSuccess() {
        ImageView imageView = this.f4245c.O;
        k71.k.f(imageView, "image");
        imageView.setVisibility(0);
    }
}
