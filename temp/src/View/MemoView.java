package View;

import Model.Memo;

import java.util.List;

public class MemoView {
    public void displayMemos(List<Memo> memos) {
        for (Memo memo : memos) {
            System.out.println("标题: " + memo.getTitle());
            System.out.println("内容: " + memo.getContent());
            System.out.println("日期: " + memo.getDate());
            System.out.println("状态: " + (memo.isCompleted() ? "已完成" : "未完成"));
            System.out.println("-------------------------");
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

