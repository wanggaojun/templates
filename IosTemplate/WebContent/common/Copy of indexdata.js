﻿var indexdata = 
[
    { text: '基础',isexpand:false, children: [ 
		{url:"/common/demos/base/resizable.htm",text:"改变大小" },
		{url:"/common/demos/base/drag.htm",text:"拖动"},
		{url:"/common/demos/base/drag2.htm",text:"拖动2"},
		{url:"/common/demos/base/dragresizable.htm",text:"拖动并改变大小"},
		{url:"/common/demos/base/tip.htm",text:"气泡"},
		{url:"/common/demos/base/tip2.htm",text:"气泡2"}
	]
    },
    { text: '过滤器', isexpand: false, children: [
		{ url: "/common/demos/filter/filter.htm", text: "自定义查询" },
		{ url: "/common/demos/filter/filterwin.htm", text: "在窗口显示" },
		{ url: "/common/demos/filter/grid.htm", text: "配合表格" } 
	]
    }, 
	{ text: '弹窗',isexpand:false, children: [ 
		{ url: "/common/demos/dialog/dialogAll.htm", text: "弹出框",isnew:true },
        { url: "/common/demos/dialog/dialogParent.htm", text: "子窗口传参", isnew: true },
		{url:"/common/demos/dialog/dialogTarget.htm",text:"载入目标DIV"},
		{url:"/common/demos/dialog/dialogUrl.htm",text:"窗口"}, 
		{url:"/common/demos/dialog/tip.htm",text:"右下角的提示"}, 
		{url:"/common/demos/dialog/window.htm",text:"可最小化"}
	]},
	{ text: '菜单',isexpand:false, children: [  
		{url:"/common/demos/menu/evenmenu.htm",text:"事件支持"},
		{url:"/common/demos/menu/menubar.htm",text:"菜单条/工具条"}, 
		{url:"/common/demos/menu/mulmenu.htm",text:"多个菜单同时存在"}
	]},
	{
	    text: '下拉框', isexpand: false, children: [
        { url: "/common/demos/comboBox/triggerEvent.htm", text: "初始化触发事件" },
         { url: "/common/demos/comboBox/comboBoxV126.htm", text: "按键支持" },
		{ url: "/common/demos/comboBox/comboBoxSelect.htm", text: "select表单" },
        { url: "/common/demos/comboBox/comboBoxUnSelect.htm", text: "可取消选择" },
        { url: "/common/demos/comboBox/comboBoxAuto.htm", text: "自动完成" },
		{url:"/common/demos/comboBox/comboBoxSingle.htm",text:"单选"},
		{url:"/common/demos/comboBox/comboBoxSingleCheckBox.htm",text:"单选(复选框)"},
		{url:"/common/demos/comboBox/comboBoxMul.htm",text:"多选"},
		{url:"/common/demos/comboBox/comboBoxTable.htm",text:"表格"},
		{url:"/common/demos/comboBox/comboBoxTableMul.htm",text:"表格(多选)"},
		{url:"/common/demos/comboBox/comboBoxInterface.htm",text:"接口方法"},
		{url:"/common/demos/comboBox/comboBoxEven.htm",text:"事件支持"},
		{url:"/common/demos/comboBox/comboBoxCase001.htm",text:"联动效果"},
		{url:"/common/demos/comboBox/comboBoxTree.htm",text:"下拉框 - 树"},
		{url: "/common/demos/comboBox/comboBoxGrid.htm", text: "下拉框 - 分页表格" },
        {url: "/common/demos/comboBox/comboBoxGridWitchCondition.htm", text: "下拉框 - 分页表格(带搜索)" },
		{ url: "/common/demos/comboBox/comboBoxPop.htm", text: "下拉框 - 新页面选取数据" },
        { url: "/common/demos/comboBox/comboBoxV123.htm", text: "实时新增数据项" }
	]},
	{
	    text: '树', isexpand: false, children: [
            { url: "/common/demos/tree/bigDataTest.htm", text: "大数据量支持" },
            { url: "/common/demos/tree/treeIsExpand.htm", text: "展开初始化" },
            { url: "/common/demos/tree/treeDelay.htm", text: "延迟加载" },
            { url: "/common/demos/tree/treeDelayUrl.htm", text: "延迟加载(异步加载)" },
		{url:"/common/demos/tree/icon.htm",text:"节点图标"},  
		{url:"/common/demos/tree/draggable.htm",text:"可拖拽"}, 
		{url:"/common/demos/tree/case/twotree.htm",text:"两个树 可拖拽"}, 
		{url:"/common/demos/tree/expandable.htm",text:"可扩展支持"}, 
		{url:"/common/demos/tree/treehtml.htm",text:"树(html初使化)"},
		{url:"/common/demos/tree/treedata.htm",text:"树(data初使化)"},
		{url:"/common/demos/tree/treeurl.htm",text:"树(url初使化)"},
		{url:"/common/demos/tree/treeedit.htm",text:"可编辑"},
		{url:"/common/demos/tree/treeselect.htm",text:"树 选择节点"},
		{url:"/common/demos/tree/treemanager.htm",text:"接口方法"},
		{url:"/common/demos/tree/treeeven.htm",text:"丰富的事件支持"},
		{url:"/common/demos/tree/treecase.htm",text:"模拟异步动态加载节点"},
		{url:"/common/demos/tree/treemenu.htm",text:"右键菜单"},
		{url:"/common/demos/tree/treecheckboxinit.htm",text:"选择初始化"},
		{ url: "/common/demos/tree/treedbdata.htm", text: "ID PID数据格式" },
		{ url: "/common/demos/tree/v132.htm", text: "取消半选择状态" }
	]
	},

    {
        text: "ListBox", isexpand: "false", children: [
               { url: "/common/demos/listbox/listbox3.htm", text: "listbox三级联动" },
            { url: "/common/demos/listbox/listboxCheckbox.htm", text: "显示复选框" },
            { url: "/common/demos/listbox/listboxMove.htm", text: "列表框可移动" },
            { url: "/common/demos/listbox/listboxMul.htm", text: "多选列表框" },
            { url: "/common/demos/listbox/listboxSingle.htm", text: "单选列表框" },
            { url: "/common/demos/listbox/listboxTable.htm", text: "表格列表框" }
        ]
    },

	{
	    text: '表单', isexpand: false, children: [
             { url: "/common/demos/form/formNew.htm", text: "html自动表单" },
              { url: "/common/demos/form/formNewValid.htm", text: "html自动表单(验证)" },

         {
             text: 'V1.2.5', isexpand: false, children: [
            { url: "/common/demos/form/v125/afterContent.htm", text: "input后置内容" },
            { url: "/common/demos/form/v125/afterContent.htm", text: "dictionary" },
            { url: "/common/demos/form/v125/enabled.htm", text: "可控制状态、可隐藏" },
            { url: "/common/demos/form/v125/fieldError.htm", text: "显示/隐藏字段错误" },
            { url: "/common/demos/form/v125/setFieldValidate.htm", text: "动态设置字段的验证信息" }
             ]
         },
        { url: "/common/demos/form/tab/default.htm", text: "页签支持1(新)" },
        { url: "/common/demos/form/tab/indexInit.htm", text: "页签支持(页签初始化)(新)" },
        { url: "/common/demos/form/tab/dataInit.htm", text: "页签支持(数据初始化)(新)" },
            { url: "/common/demos/v121/form/data.htm", text: "加载/设置数据" },
        { url: "/common/demos/form/v118/autoform.htm", text: "自动创建表单(新)" },
        { url: "/common/demos/form/v118/autoform2.htm", text: "自动创建表单2" },
         { url: "/common/demos/v120/form/selectLink.htm", text: "联动效果" },
         { url: "/common/demos/v120/form/buttons.htm", text: "按钮" },
         { url: "/common/demos/v120/form/buttons2.htm", text: "按钮2" },
          { url: "/common/demos/v121/form/getEditor.htm", text: "获取表单元素" },
		{url:"/common/demos/form/button.htm",text:"按钮"},
		{url:"/common/demos/form/checkbox.htm",text:"复选框"},
		{url:"/common/demos/form/checkbox2.htm",text:"复选框2"},
		{url:"/common/demos/form/radio.htm",text:"单选框"},
		{url:"/common/demos/form/radio2.htm",text:"单选框2"},
		{url:"/common/demos/form/spinner.htm",text:"调整器"},
		{url:"/common/demos/form/spinner2.htm",text:"调整器2"},
		{url:"/common/demos/form/dateEditor.htm",text:"日期"}, 
		{url:"/common/demos/form/textbox.htm",text:"文本框"},
		{ url: "/common/demos/form/textbox2.htm", text: "文本框2" },

       {text: "RadioList", url : "/common/demos/form/radioList.htm" },
       { text: "CheckBoxList", url: "/common/demos/form/checkboxlist.htm" },
        { text: "弹出框1", url: "/common/demos/form/popupEdit1.htm" },
       { text: "弹出框2", url: "/common/demos/form/popupEdit2.htm" },
  
		{ url: "/common/demos/form/form1.htm", text: "综合" },
         { url: "/common/demos/v121/form/validate.htm", text: "表单验证(内置)" },
		{url:"/common/demos/form/validator/errorLabelContainer.htm",text:"表单验证1"},
		{url:"/common/demos/form/validator/form2.htm",text:"表单验证2"},
		{url:"/common/demos/form/validator/form3.htm",text:"表单验证3"},
		{url:"/common/demos/form/validator/form4.htm",text:"表单验证4"},
		{url:"/common/demos/form/validator/invalidHandler.htm",text:"表单验证5"}
	]},
	{ isexpand: "false", text: "表格", children: [
        { isexpand: "false", text: "搜索支持", children: [
		    { url: "/common/demos/filter/grid.htm", text: "高级自定义查询" },
             { url: "/common/demos/grid/search/autoFilter.htm", text: "自动过滤" },
            { url: "/common/demos/grid/search/search.htm", text: "查询 表格" }
	    ] 
        },
         {
             isexpand: "false", text: "V126", children: [
              { url: "/common/demos/grid/v126/key.htm", text: "键盘支持" } 
             ]
         },
          {
              isexpand: "false", text: "V131", children: [ 
             { url: "dotnet/common/demos/grid/pager/server_scroll.aspx", text: "滚动分页(追加分页)" },
             { url: "dotnet/common/demos/grid/pager/server_scroll2.aspx", text: "滚动分页(自定义分页栏)" } 
              ]
          },
	    {isexpand:"false",text:"固定列",children:[ 
		    {url:"/common/demos/grid/frozen/frozengrid.htm",text:"固定列"}, 
		    {url:"/common/demos/grid/frozen/treefrozengrid.htm",text:"兼容树"}, 
		    {url:"/common/demos/grid/frozen/mulheaders.htm",text:"兼容多表头"}
	    ]}, 
	    {isexpand:"false",text:"可扩展支持",children:[ 
		    {url:"/common/demos/grid/expandable/method.htm",text:"方法"}, 
		    { url: "/common/demos/grid/expandable/editor_numberbox.htm", text: "编辑器" }, 
		    {url:"/common/demos/grid/expandable/formatter.htm",text:"格式化器"},
		    {url:"/common/demos/grid/expandable/sorter.htm",text:"自定义排序"}
	    ]}, 
	    {isexpand:"false",text:"编辑(行)",children:[ 
		    {url:"/common/demos/grid/editrow/editrow.htm",text:"编辑"}, 
		    {url:"/common/demos/grid/editrow/editrow2.htm",text:"编辑2"}
	    ]},
	    {isexpand:"false",text:"编辑(明细)",children:[ 
		    {url:"/common/demos/grid/editdetail/detail.htm",text:"编辑"}, 
		    {url:"/common/demos/grid/editdetail/detail2.htm",text:"编辑2"}
	    ]},
	    {isexpand:"false",text:"编辑表格",children:[ 
		    { url: "/common/demos/grid/editgrid/addrow.htm", text: "编辑支持" }, 
		    { url: "/common/demos/grid/editgrid/popup.htm", text: "在弹出框选择" },
             { url: "/common/demos/v120/editgrid/popup.htm", text: "弹出框1" },
             { url: "/common/demos/v120/editgrid/popup2.htm", text: "弹出框2" },
             { url: "/common/demos/v120/editgrid/selectLink.htm", text: "联动效果" },
		    {url:"/common/demos/grid/editgrid/addrowwithdata.htm",text:"增加行"},
		    { url: "/common/demos/grid/editgrid/addrowwithdata2.htm", text: "引入行" },
            { url: "/common/demos/grid/editgrid/addrowwithdata3.htm", text: "引入行2(推荐)" },
		    {url:"/common/demos/grid/editgrid/editgrideven.htm",text:"编辑器事件"},
		    {url:"/common/demos/grid/editgrid/editgridupdatecell.htm",text:"更新单元格"}, 
		    {url:"/common/demos/grid/editgrid/updaterow.htm",text:"更新行"}, 
		    {url:"/common/demos/grid/editgrid/getdata.htm",text:"获取更新数据"}
	    ]},
	    {isexpand:"false",text:"复选框支持",children:[ 
		    {url:"/common/demos/grid/checkbox/default.htm",text:"带复选框"}, 
		    {url:"/common/demos/grid/checkbox/init.htm",text:"复选框初始化"}, 
		    {url:"/common/demos/grid/checkbox/memory.htm",text:"复选框分页记忆"}
	    ]}, 
	    {isexpand:"false",text:"表头/列",children:[ 
		    {url:"/common/demos/grid/header/changeheadertext.htm",text:"改变表头文本"}, 
		    {url:"/common/demos/grid/header/columnpercentage.htm",text:"列 宽度百分比"}, 
		    {url:"/common/demos/grid/header/hidecolumn.htm",text:"显示/隐藏 列"},  
		    {url:"/common/demos/grid/header/setcolumnwidth.htm",text:"列 调整宽度"},  
		    {url:"/common/demos/grid/mulheader/grid1.htm",text:"多表头1"},
		    {url:"/common/demos/grid/mulheader/grid2.htm",text:"多表头2"},
		    {url:"/common/demos/grid/mulheader/grid3.htm",text:"多表头3"}, 
		    {url:"/common/demos/grid/header/setcolumns.htm",text:"动态设置表头"}
	    ]}, 
	    {isexpand:"false",text:"汇总",children:[ 
		    {url:"/common/demos/grid/total/totalgrid.htm",text:"汇总表格"},
		    {url:"/common/demos/grid/total/totalgrid2.htm",text:"汇总表格2"},
		    {url:"/common/demos/grid/total/totalgridall.htm",text:"汇总表格3(全部数据)"},
		    {url:"/common/demos/grid/total/group.htm",text:"带分组"}
	    ]}, 
	    {isexpand:"false",text:"行事件",children:[ 
		    {url:"/common/demos/grid/rowgrid/allowUnSelectRow.htm",text:"选择行(支持Ctrl)"}, 
		    {url:"/common/demos/grid/rowgrid/checkrowgrid.htm",text:"选择行支持(复选框)"}, 
		    {url:"/common/demos/grid/rowgrid/selectRowButtonOnly.htm",text:"点击复选框才能选择行"}, 
		    { url: "/common/demos/grid/rowgrid/selectrowgrid.htm", text: "选择行支持" },
            { url: "/common/demos/grid/rowgrid/dbclickrowgrid.htm", text: "双击行支持" },
		    {url:"/common/demos/grid/rowgrid/contextmenurowgrid.htm",text:"右击支持"} 
	    ]}, 
	    {isexpand:"false",text:"分组",children:[
		    { url: "/common/demos/grid/groupable/default.htm", text: "默认" },
            { url: "/common/demos/grid/groupable/render.htm", text: "自定义格式" },   
		    {url:"/common/demos/grid/groupable/checkbox.htm",text:"带复选框"},   
		    {url:"/common/demos/grid/groupable/detail.htm",text:"明细"},  
		    {url:"/common/demos/grid/groupable/total.htm",text:"汇总"} 
	    ]}, 
	    {isexpand:"false",text:"树",children:[ 
		    { url: "/common/demos/grid/treegrid/treegrid.htm", text: "树 表格" },
            { url: "/common/demos/grid/treegrid/listdata.htm", text: "线性结构" },
		    {url:"/common/demos/grid/treegrid/editable.htm",text:"树 可编辑"}, 
		    { url: "/common/demos/grid/treegrid/draggable.htm", text: "树 可拖拽" },
		    { url: "/common/demos/grid/treegrid/extendinit.htm", text: "树 收缩 初始化" },
		    { url: "/common/demos/grid/treegrid/extendToLoad.htm", text: "树 异步加载子节点" }
	    ]}, 
	    {isexpand:"false",text:"基本功能",children:[ 
		    {url:"/common/demos/grid/base/toolbar.htm",text:"带工具条"}, 
		    {url:"/common/demos/grid/base/rownumbers.htm",text:"行序号"},
		    {url:"/common/demos/grid/base/fullgrid.htm",text:"百分比高度表格"}, 
		    {url:"/common/demos/grid/base/templategrid.htm",text:"自定义单元格"},  
		    {url:"/common/demos/grid/base/normalgrid.htm",text:"高度宽度设置"},   
		    {url:"/common/demos/grid/base/delaydata.htm",text:"延时加载"}, 
		    {url:"/common/demos/grid/base/draggable.htm",text:"多行移位"},
		    {url:"/common/demos/grid/base/draggable2.htm",text:"行移位、表头拖拽"},
		    { url: "/common/demos/grid/base/twogriddraggable.htm", text: "两个表格拖拽" },
             { url: "dotnet/common/demos/grid/bigdata.aspx", text: "大数据量" }
	    ]}, 
	    {isexpand:"false",text:"明细",children:[ 
		    {url:"/common/demos/grid/detailgrid/default.htm",text:"明细 表格"}, 
		    {url:"/common/demos/grid/detailgrid/height.htm",text:"设置高度"}
	    ]}
    ]},
    {isexpand:"false",text:"Tab",children:[ 
	    {url:"/common/demos/tab/tabHtml.htm",text:"Tab"},
	    {url:"/common/demos/tab/tabEven.htm",text:"事件"},
	    { url: "/common/demos/tab/tabManager.htm", text: "接口" },
         { url: "/common/demos/v120/tab/setHeader.htm", text: "设置头部文本" }
    ]},
    {isexpand:"false",text:"面板",children:[ 
	    {url:"/common/demos/accordion/accordion.htm",text:"面板"}
    ]},
    {
        isexpand: "false", text: "布局", children: [
            
        { url: "/common/demos/layout/layoutEvent.htm", text: "事件支持" },
        { url: "/common/demos/layout/layoutCenterBottom.htm", text: "中间下方区域(新)" }, 
	    {url:"/common/demos/layout/layoutMinWidth.htm",text:"最小宽度"},
	    {url:"/common/demos/layout/layoutAutoHeight.htm",text:"自动高度"},
	    {url:"/common/demos/layout/layoutAutoHeightAndDiff.htm",text:"高度补差"},
	    {url:"/common/demos/layout/layoutCenterOnly.htm",text:"只显示中间部分"},
	    {url:"/common/demos/layout/layoutFixedHeight.htm",text:"固定高度"},
	    {url:"/common/demos/layout/layoutFullHeight.htm",text:"全屏高度"},
	    {url:"/common/demos/layout/layoutHalfHeight.htm",text:"百分比高度"},
	    {url:"/common/demos/layout/layoutLeftMiddleOnly.htm",text:"只显示左侧和中间"},
	    {url:"/common/demos/layout/layoutLeftWidth.htm",text:"限制左边宽度"},
	    {url:"/common/demos/layout/layoutLeftHide.htm",text:"左边刚开始隐藏"}, 
	    {url:"/common/demos/layout/layoutHideToggle.htm",text:"左边右边不允许隐藏"},  
	    {url:"/common/demos/layout/layoutResizeDisable.htm",text:"左边底部不允许调整大小"}  
    ]
    },
    {
        isexpand: "false", text: "Portal", children: [
            { url: "/common/demos/portal/portal.htm", text: "默认" },
           { url: "/common/demos/portal/panel.htm", text: "panel" },
               { url: "/common/demos/portal/panel-event.htm", text: "panel事件支持" },
           { url: "/common/demos/portal/portal-columns.htm", text: "columns" },
           { url: "/common/demos/portal/portal-cookie.htm", text: "记忆" },
           { url: "/common/demos/portal/portal-drag.htm", text: "可拖动" },
           { url: "/common/demos/portal/portal-get.htm", text: "方法" },
           { url: "/common/demos/portal/portal-url.htm", text: "载入页面" },
            { url: "/common/demos/portal/portal-rows-url.htm", text: "通过url载入模型" },
           { url: "/common/demos/portal/portal-inject.htm", text: "html启动模式" },
           { url: "/common/demos/portal/portal-method.htm", text: "方法2" }
        ]
    }
];


var indexdata2 =
[
    { isexpand: "true", text: "表格", children: [
        { isexpand: "true", text: "可排序", children: [
		    { url: "dotnet/common/demos/grid/sortable/client.aspx", text: "客户端" },
            { url: "dotnet/common/demos/grid/sortable/server.aspx", text: "服务器" }
	    ]
        },
        { isexpand: "true", text: "可分页", children: [
		    { url: "dotnet/common/demos/grid/pager/client.aspx", text: "客户端" },
            { url: "dotnet/common/demos/grid/pager/server.aspx", text: "服务器" },
            { url: "dotnet/common/demos/grid/pager/server_scroll.aspx", text: "滚动分页" }
	    ]
        },
        { isexpand: "true", text: "树表格", children: [
		    { url: "dotnet/common/demos/grid/treegrid/tree.aspx", text: "树表格" }, 
		    { url: "dotnet/common/demos/grid/treegrid/tree2.aspx", text: "树表格2" }
	    ]
        }
    ]
    }
];
