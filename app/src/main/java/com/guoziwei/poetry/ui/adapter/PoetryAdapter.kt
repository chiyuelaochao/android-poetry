package com.guoziwei.poetry.ui.adapter

import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.guoziwei.poetry.R
import com.guoziwei.poetry.model.Poetry
import com.guoziwei.poetry.util.Utils

/**
 * Created by Administrator on 2018/4/26 0026.
 */
class PoetryAdapter : BaseQuickAdapter<Poetry, BaseViewHolder>(R.layout.item_poetry_list, null) {

    override fun convert(helper: BaseViewHolder, item: Poetry) {
        val tvTitle: TextView = helper.getView(R.id.tv_title)
        val tvAuthor: TextView = helper.getView(R.id.tv_author)
        val tvContent: TextView = helper.getView(R.id.tv_content)
        Utils.setText(tvTitle, item.title, false)
        Utils.setText(tvAuthor, item.author, false)
        Utils.setText(tvContent, item.content, false)
    }
}