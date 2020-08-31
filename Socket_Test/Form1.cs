using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Net.Sockets; 

namespace Socket_Test
{
    public partial class Form1 : Form
    {

       

        public Form1()
        {
            InitializeComponent();
            //// rb server 가 선택되도록 

        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnConnect_Click(object sender, EventArgs e)
        {

            if(rbServer.Checked == true)
            {
                /// server 연결과정

            }
            else
            {
                /// client 연결과정


            }

            MessageBox.Show("연결!!!!");
            //// 서버 socket bind listen 

            //// 클라이언트 socket connect 


        }

        private void btnSend_Click(object sender, EventArgs e)
        {
            //송수신 하는 단계  
        }
    }
}
