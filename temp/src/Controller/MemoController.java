package Controller;
// MemoController.java
import Model.Memo;
import Model.MemoModel;
import View.MemoView;

import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;

public class MemoController {
    private MemoModel model;
    private MemoView view;

    public MemoController(MemoModel model, MemoView view) {
        this.model = model;
        this.view = view;
    }

    public void addMemo(String title, String content, String date) {
        Memo memo = new Memo(title, content, date);
        model.addMemo(memo);
        view.displayMessage("备忘录添加成功");
    }

    public void deleteMemo(String title) {
        Memo memoToDelete = null;
        for (Memo memo : model.getMemos()) {
            if (memo.getTitle().equals(title)) {
                memoToDelete = memo;
                break;
            }
        }
        if (memoToDelete != null) {
            model.deleteMemo(memoToDelete);
            view.displayMessage("备忘录删除成功");
        } else {
            view.displayMessage("未找到备忘录");
        }
    }

    public void completeMemo(String title) {
        for (Memo memo : model.getMemos()) {
            if (memo.getTitle().equals(title)) {
                memo.setCompleted(true);
                view.displayMessage("备忘录标记为已完成");
                return;
            }
        }
        view.displayMessage("未找到备忘录");
    }

    public void searchMemos(String keyword) {
        List<Memo> result = model.searchMemos(keyword);
        view.displayMemos(result);
    }

    public void displayMemosByDate(String date) {
        List<Memo> result = model.getMemosByDate(date);
        view.displayMemos(result);
    }

    public void displayAllMemos() {
        view.displayMemos(model.getMemos());
    }
}



