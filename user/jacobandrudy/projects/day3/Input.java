package user.jacobandrudy.projects.day3;

import java.util.ArrayList;

public class Input {
    
    public static void printInput(String input) {
        System.out.println(input);
    }
    


    
    
    
    
    public static String createInput() {
        String input = "QLFdFCdlLcVqdvFLnFLSSShZwptfHHhfZZZpSwfmHp\r\n" + //
                "rTJRjjbJTgzDJjdsRsfwtfNwtfmZpZNhmmzt\r\n" + //
                "bMdJjsjglnVMFCCc\r\n" + //
                "BZvZMBBBMTtZTgcCPdgtgQCrrV\r\n" + //
                "VspNDDpsGDGnRmRpRplQdrrPcPCjgDCcPQCQQj\r\n" + //
                "RVnsmspnpwFRlHGRwHHlnRSThSSvBTbFTZMqTMZMTZFh\r\n" + //
                "ttffrVJWtWpgtQnZGVnNSLTHSZ\r\n" + //
                "jRsjjmhdRcjcRsFcdwGLMZSnHMTSMNZN\r\n" + //
                "RjczlvjhPCcPjcvRpbglWplJBblqrGgq\r\n" + //
                "NwCWwdNQNDCwGpWNQwmJtZgPZrdJgLZcPhLddr\r\n" + //
                "blqpnFTqrLbcLPtV\r\n" + //
                "MnjqSSpqlFRvSqNDGHvWHQDwfWmm\r\n" + //
                "jfLljlQhDLmlrMJQtJTJrQqQ\r\n" + //
                "NpBbjjsdMCgCCMrb\r\n" + //
                "dwspwGnSHHGsGzDDlFDjVWjfZWnP\r\n" + //
                "wQhTZwvpZFZdqWLnnwSrWC\r\n" + //
                "mfDmMFlDcPLdgDSCLCqg\r\n" + //
                "PmzclsMclMlFsHHsJZFHpT\r\n" + //
                "LfLJWNdJnBLfhndfWdZqcgDZgSqgCCSSSLDF\r\n" + //
                "bQVQmrrjPqQDZSZBCQ\r\n" + //
                "RRtGjVmRsPbPrrnNNpNHHnBnpHns\r\n" + //
                "PfbGNwGBwNcPTbGNQFBVjsjztVztVjHV\r\n" + //
                "hrdCJhmlJhZrLDRmghrmDrzqFsbgtbHqnznzznQtbjtz\r\n" + //
                "WdZdDJCDmrJmLZrLDLDZlClcSccwSPbNPfSNWfGNNWMGNc\r\n" + //
                "QwrnTSgqgFShSdfHPdbS\r\n" + //
                "BGdjmMmZMvfhvCZZPf\r\n" + //
                "BzGmzVGGGzmzGpVBtdnQqqdTQQDDqrpR\r\n" + //
                "PPRPwLQlLtbPmbwgJhrSssNlhhrgsZ\r\n" + //
                "fFTdFvTMNfzVnFqdnjgSSjjsSjhghpJs\r\n" + //
                "dvczcFzNTWVWMFLcLbQQwmbHLCLL\r\n" + //
                "HhLLDfMmTjsjmLmhsmmfZMjGtpGJtdcvnCWtZJcWGddttW\r\n" + //
                "gwrwwgzwgDpJddrJDr\r\n" + //
                "SBwBBbgVsVmRRhDM\r\n" + //
                "SZdmfdZRTQZTQgHVVGGRqZdVCjCcNCNcJRWcCBbJjCPCsNsc\r\n" + //
                "FnhzMMhDDFlzlnvpwMLrMDCsbcjNJbcJbBcBfPhCNbWj\r\n" + //
                "wzwnpDDnLvFnLlttLrzGgTVGQqZtTqSqSdfZTg\r\n" + //
                "FJJWWWrCGWdmzFlTVqqlMhmvVlNh\r\n" + //
                "btpgtfjZjjhgggrNMThl\r\n" + //
                "DpwpfRZDZwwfwjsnjfsZnnnwGcCRCHcCCCLGHLWcrcFCWCHW\r\n" + //
                "ljHHHBtjQthchhZpqqNt\r\n" + //
                "FTmJnPFwzlJPmzTgTgbFwJbMCpbMchhhqbhWCDMDhZcppM\r\n" + //
                "JwlFGwVGnFFGBGjdSsfdsG\r\n" + //
                "QsvpGhjGgswvjjwjjjvPpThJfLZCCLCSSLbFLStCFCSgtH\r\n" + //
                "mDrzdzMqqnMrDMmZnqnzNVRCStlCHFSCtJqlCLFCFLfJfJ\r\n" + //
                "mBDzNRWBDDMBpGsZcGZWGjPp\r\n" + //
                "SlLQhQsvvttFlWsWcfHHMTJfwSHwTfTf\r\n" + //
                "VZmmrRDRfpTHJcRf\r\n" + //
                "jzBnDDgjPchWlsQsBW\r\n" + //
                "LTLVdTSLNTLnTSnrWvdwswsfmJwmwGsffH\r\n" + //
                "FbgCbRRppCpPbgMcZvCcGftGGltwHwGtplQQsfJw\r\n" + //
                "CRBMCvZZRgMgBbDCPcDrjLzWLVrSSzShSSNrBS\r\n" + //
                "hVJJjhjRVRZjQvDfBstsBVNBdwstHsld\r\n" + //
                "pCTCcMqCThTFLFFPWcWSPHtwwdmcBHHmNtHdmwmwBl\r\n" + //
                "rMTCCWPLLPCMFhDnDrjzRrfDJD\r\n" + //
                "pqMpCvMchvFNWSBdVNqQ\r\n" + //
                "zDRJJDGJJtNtmGRRWVdFWWVdSfjb\r\n" + //
                "DDJLmnJmzwGmGLTPhTCNpgcrpv\r\n" + //
                "cpPpbPWVprWcbJrrwpCwwdWrvNNFRqzNnChgqFzFnZvqFlzq\r\n" + //
                "fTtHLfSHSsNDGLSmsLvnhFqzhzlzDhhvRlFz\r\n" + //
                "mSMLHTQTmHMSfBSMTPdBJJNNVddrVrbjbJ\r\n" + //
                "zpCpBTnFgFbncznbblzdhRswdlJsLllJdw\r\n" + //
                "QqqmtWVPWvHDVmqDhjsljwRhlZldhRMQ\r\n" + //
                "tWSHDmVfmrtPHVgGRRbgTRpSgpTc\r\n" + //
                "ssTbzFRtPRwTFZtvbPRMhndBqMMvMBHJnnHMMd\r\n" + //
                "WQVWzlGWVBqqdMQJMq\r\n" + //
                "pVSpSSgLfjDzWrLGWWjDzzfLtbRFFNtPZRssspsNRZcRsNZb\r\n" + //
                "jnPzzGlnnznWnzhvGnnpVFrZmVFcgjrrmZRFtj\r\n" + //
                "fsbgTdwdqBbfwCptVtdZRcrRCp\r\n" + //
                "gsMbgfHsBSwsGhhJWMLnWPPJ\r\n" + //
                "bpmbJpNbbbNGGmRJzJTsfdsvsNdglfhssCvC\r\n" + //
                "hWLwQjZjLhjHFFBLZldvvflrvtfjCrfjlT\r\n" + //
                "QWVQZZFDcDJJhJJc\r\n" + //
                "RmRghgRlNgfGGRmdGqhsgsZFZZpBvHpZppHcgH\r\n" + //
                "tbLCDLnLtSbbbjtPtMLtDPTvHHBpcHcsHvTcHsmZcF\r\n" + //
                "rSLrMJzDznzGmhNlVwdrRr\r\n" + //
                "vWjljMWcnSSpjmzbJVzJrTCmtGJV\r\n" + //
                "NZDDQLRqPJrPzrprTC\r\n" + //
                "gqDqqwpdHWhlgnjH\r\n" + //
                "ccptcpstDvbNvHbLNRZZ\r\n" + //
                "dFjhdnjQFJlFCQSjgngJPJgWWrRNWNRtNCzrVbRzNVzZZL\r\n" + //
                "PhThFSPPSpsmTcqMwt\r\n" + //
                "cLcLlMhGMGcpGzslHFHFvnHlBDvWbT\r\n" + //
                "VHdQwqPJdPwjJPdPQRrmjjjQnTFrbvNWFFffDvbvvNDvbBNN\r\n" + //
                "RwRJCHmmdQJZZLzGphcCtz\r\n" + //
                "hVvFVjvjVWmFRQVZqTpqtwQpwpqZfp\r\n" + //
                "gvDlSBDJSlPLcLdDwzwtptqTTTzwcCCt\r\n" + //
                "JgrJGbLgvnWsmvVr\r\n" + //
                "rwmqqRqrnHQGmnjCCqCzdBzCBJBz\r\n" + //
                "hFLgbWWPWmvtLhPtgpcdjJdcBJdpJjDsgp\r\n" + //
                "lvfhSSPWtTNTTZZmfr\r\n" + //
                "bHDDssRHsjNMbJjJLQJsbTtGvSCzCGQCTzGvSqSBzT\r\n" + //
                "mmVrwhmmpfPStnTSBnhStG\r\n" + //
                "pcwrptZcgFcmpgHRDjjZlDJsjbbD\r\n" + //
                "JJRrmFqJMdFFJMjjJcqGgzSCSHSCscPCHPHGZc\r\n" + //
                "VWpWptnvSmpPGCHC\r\n" + //
                "vQnDLBmbntvLBbnlldTQFlJlFFrNRd\r\n" + //
                "LPDftnHFQfwmBcBGmc\r\n" + //
                "CVqRsdqvdrlsCVsNvqwwSpTNSSDSDDBBTTSN\r\n" + //
                "lqlDRddjbblRbRqrlRRjsbvghHHnPQWjHWQWZHPHWZhFnP\r\n" + //
                "bwQsDcgsJqcsDpcQRQnpqtVSVvgSMMMfMvfVBVfdvM\r\n" + //
                "CGZFrHHPrTZNGGZZHmCZHlVfjfzjSfzBtBBNSBVjvntf\r\n" + //
                "ChrCCLGrTlhJnhDncRbp\r\n" + //
                "nmFnhfTQjSzfjddZWsRRRFRFGl\r\n" + //
                "HDgCwgtQbZlHsrqHHr\r\n" + //
                "cJPCgCCPbpbgDMPvMQnjmnhTfmzLpQQmjz\r\n" + //
                "QFHSQdNMCSgcSgFtttPNFJpCpnTjZlbblpppZplZjz\r\n" + //
                "LqLsWMRRfrrWMmMGpbTnbppbZnTjpnmm\r\n" + //
                "fWBrMqWsGswGfGRMMwrLgtPPdNFBQPHNHNPPcFPP\r\n" + //
                "dngbSppJSSppbVMZQQMjqfQQgwcl\r\n" + //
                "TWmSWtvCRCWjwfjqQqMstq\r\n" + //
                "FhFvRzSTNmhHnVPhGhBJdBpB\r\n" + //
                "gcHPgzGmPPwTsSTsbwbdWD\r\n" + //
                "QjBLLfVhhBqqBFQLrLjVFlNpNDtsSWTDdNptdbqbdS\r\n" + //
                "jCMFLVjFBFjJJLFFMVBFrLnvPzHRmHPGnGWWcCvzHRZm\r\n" + //
                "PDPqWWjhPpPbCsjwjTVbLT\r\n" + //
                "SrtCttGRMddSVwHFSs\r\n" + //
                "JtfvttmrGMRRJzJCqhqqqWQZhCNgJZ\r\n" + //
                "ChrCVFQCVQlwQNwpQcmmcjmWBmddghjjdW\r\n" + //
                "sbDTZStTqqfSBggPmWjWWNsL\r\n" + //
                "THqqSHDTtZTDTHZZbHTzRzFvlFCVprFprQVnCzNppQrz\r\n" + //
                "PdfWCwMWjPSrdgCMnnlGsGQvvpJZvFGnps\r\n" + //
                "DmBhVBLbbVqVBzTRLBRzzTLNNpRQNNZQZppZvlQpZvllvF\r\n" + //
                "zVDtVHBbbTbzDbrjgWjMPtMWPMlj\r\n" + //
                "JLsTTNDsgTMNvDQpLpGpLGNJShrfzCFnSnSrnfzCfTFhWrfw\r\n" + //
                "ZcqrRddHZZVRfzWnVWCzWFnn\r\n" + //
                "tZHZtrHHPdRtdHlcccQggsplpJDNvMGNGMss\r\n" + //
                "cMCLfStfMTCjPMPcGzjftMbgsRNmRgmmGsmnJbNJbghJ\r\n" + //
                "QHVVWrFFWZNShHSgbSJm\r\n" + //
                "qZwwrrpqpZpZFvqrQdFlQVSwLBMBfTTLTjLBCcdTMzMftPPB\r\n" + //
                "SwsdBTvgvJLPNptpCpCmBDtn\r\n" + //
                "wffrzwGFWFNZWpjWZnNm\r\n" + //
                "zrfflbRwJPhbPbsS\r\n" + //
                "HjHHRtwjnjRblQRttHwQGvGWNNBWvqGzfTvfNN\r\n" + //
                "FmScCcrsdVZrpBrVcCVFzffvzzmWGLWgqWqgGWzW\r\n" + //
                "SFVSDDBdsdDSJhnjJltJbPtHRM\r\n" + //
                "FjGFVqWrzQFlQrZzGQzFLTvfwwTgMnvcnbRMLRdnfb\r\n" + //
                "CCttSNsSnRfgncSg\r\n" + //
                "CNspmDBPtPmJJNBJPNpDhQZVzQlhqrGZflfVjQFrQj\r\n" + //
                "dNNdHWcmdmPPptmmWHpPTFFjJPGrQsVsPQGGGJVDrVVGrS\r\n" + //
                "MhZlZhlgflgfnfDtjbjJGbtnVtGS\r\n" + //
                "LtZqlzhzqMZWHHLwdHmFWp\r\n" + //
                "llNRlfwWRwwLlwFNNgRrVCBjdjCVdjpWjtVWCD\r\n" + //
                "HTQqzPqzQPmhhmSPznSsssJtdnMZddtMCjprtMjCnBVnjZ\r\n" + //
                "PzHQmqsGSJPSmQqPbfwNcgNbNgNfBGwR\r\n" + //
                "lPdzlZPzQzMZQGQrTZvvpjHTTpfsTTZb\r\n" + //
                "zRShhtWRnqnqSNRnDTTHvfNJspNsLpTsjL\r\n" + //
                "hBVncVtDSnhDnDBBtGrlzwmmMlGmVrMdrP\r\n" + //
                "HPTZVHVPlHDPlfgnjJFdJdjPjSPqCS\r\n" + //
                "hLRRBhwGhqbtmsRSSSjjdMJjnJGSMj\r\n" + //
                "QrQtqrRrcQDgVglc\r\n" + //
                "ZTwbbZdchZZjmVWHTrHWBVJtBB\r\n" + //
                "glslCDqLLDfGRqlsgLssfrCHBHFHmrHBBppFmCJWWp\r\n" + //
                "fRzvvvgGgNSNvmQbSQ\r\n" + //
                "qPGGPwCTqTzHCvPGqWdLFLssLpstLLspvd\r\n" + //
                "njJchhcbjbDrbcLNlLrpWWrLLHgp\r\n" + //
                "DQhMMMJQMQJnVbbnRHSMPwZmGZPZRTRCwTZmZGwz\r\n" + //
                "zzGNfPbcgdPqLrqvWWVzMq\r\n" + //
                "DGmJtnJTJRhhJMhCQqCLCLrrLM\r\n" + //
                "ZnHDtSZlTBHnBdccGSfGcwjjdb\r\n" + //
                "FpZDpQZDvMwZpCCMdCBPpJGPPLgJGGLffJJL\r\n" + //
                "jlbswNrlPPJJfGlf\r\n" + //
                "bnNwqbHnNwRSrqhbdCcmHddQzddFDdvZ\r\n" + //
                "gbQQQngWPVVtvvPQNVNvWWSHGwDsCCmDtHSlmrssDmHs\r\n" + //
                "fqhMLFFMMZqZMRZqMjRMqLJSCdFlrrldsDrCsDSSHHGCSC\r\n" + //
                "MJRZLZLGMcTqczjNPzNnzPvWBVgNnP\r\n" + //
                "gqdbBffTvlRHbwLl\r\n" + //
                "nMMQJQpGdsFpQsJzNMRLLDlmLLmjFFmLjDRF\r\n" + //
                "pzGMnVcMBfTdtBBV\r\n" + //
                "WSbfmrrrrWdbWmdfDSSStmHjtMtvCLVnqBHCVGtVGnMM\r\n" + //
                "lRcgFRZhJgnMLjvGgv\r\n" + //
                "lcvwTcFTplvwphzcTTJTbsdsPSPDdbmzmDSWPsSm\r\n" + //
                "bbdTjTQTQMsZNqqhJrZslg\r\n" + //
                "jFGVjwfCPVGfwjCVqWhWZFgqWrglllNN\r\n" + //
                "PjfSPzRBjCCfSBCGBLznTndHcdMLbMmmdT\r\n" + //
                "wSVMJSVccdGwGnsgbVTTbRsCRNgN\r\n" + //
                "rHjhHLmrhPJrqjNTRDgBbbRRRs\r\n" + //
                "zqmPPqqpPLzltrMdJcZpfdpGWWJJ\r\n" + //
                "ZhrBBJGrgJhGHttGGVPPcPPF\r\n" + //
                "cnzLqNssfRnpfWqsLfcfWQNMbMVPDtnDtbHFtMbPtVPFFM\r\n" + //
                "jfqzCCLsWQLcjgldjmljmgTd\r\n" + //
                "wghGSSGZPVwgqtwtwCCtFFMM\r\n" + //
                "BvbspnBznvvWHWHHHbCQptQFQlFcqMClqLLq\r\n" + //
                "JWzzsJHWzfWjJrvMBWHBBGDmVDrVhZmmgSPSmZVVrh\r\n" + //
                "ccRMJRsjjgJgcPCSCCVCwsSWVNzp\r\n" + //
                "WQQqnmrBWtqWqdSbVwwBSpbbCSBB\r\n" + //
                "QvDqmqqmgWPWjPvW\r\n" + //
                "msqpjDWspRWwvFvDWWhnbbJfPzFQblJJPlnz\r\n" + //
                "gGGrMTgLVBsBBLdsVTrSCBffHQfdHhnbPPPPffndlbzh\r\n" + //
                "ZCVsCGSScsLZpwNpqmZRqW\r\n" + //
                "PPsGmJPVPQPZmsQCVPJPnPCMDcTcdqDDTqvFhvnTjRDTDchq\r\n" + //
                "BdrtzNBLHStHrdrlwfNThvFhcvbDccThjbFBqq\r\n" + //
                "SSgdHNfSHHgzLHtLNWSPQQPMQVpmmppVCmQZCW\r\n" + //
                "pPssrWWLdndHPJdd\r\n" + //
                "QNQFTLNBFTzzgjfGTjffFNZjCSGnHDnSDJHnDScttDCcDnmd\r\n" + //
                "FVzVLZwZZgswqqrbphbR\r\n" + //
                "VpWCZjCwWnppZpqnhNjjNZjFLtLzQJHdHLQRzWLRzRztHJ\r\n" + //
                "DMGPmPMgTSmsgQzRFbdHRLJgdn\r\n" + //
                "csDMPMGDDvMSSPnDTvrDChhwljlqNNjchNCjNVcf\r\n" + //
                "WpGGmbSGpVWWpjMMTNdfCFNdFfRNwNSF\r\n" + //
                "JsQztzrvrJqsTTRbbvFBhhhv\r\n" + //
                "cLrDqLccsLqbDHGpZWDHgjGlZW\r\n" + //
                "QGMQJMmsJmMCmmqjsRvLvvdgvgVvDVdD\r\n" + //
                "BDcrcNbNppwTpzRdvvchhFvfFv\r\n" + //
                "plBBwWrbpQHDjGmGJl\r\n" + //
                "mzFlTdmSDzrPvCJqqDVVNC\r\n" + //
                "hfRmhgjRhnfwnRHcnhGGvPJQPvvfLfQvNLGv\r\n" + //
                "BhhnjMgRWghpwjRWMRjrZzdbSbsdstTrltdmMs\r\n" + //
                "bLLnbqjpvplnDvNlqpqBWJZSdPJCNdJJThhSPhTd\r\n" + //
                "HFwHHQMMFHGzGwRPPJPTWthTZtJSQr\r\n" + //
                "mfWMHFHWHmgmFcwGwwpbDljqjBDcDnLcVnlb\r\n" + //
                "wBrWBwSWRJMBwdZnPQPgFnwGVF\r\n" + //
                "fLjfbsvDDfvvqqGqZGqmPQgqTGGG\r\n" + //
                "vZLsjzjjZCzJWRNSBR\r\n" + //
                "jTRbRHHqPqTRBHqdjhgvgghhZQdDvvgvhC\r\n" + //
                "WLWWzzFszsmNFGWSFmMrpghCtZvhlQNDgQCDgctC\r\n" + //
                "FJsLsSrDmsFSDLWrzJmmMsGqjRBVbJTBVPVBbBqRjPBjHn\r\n" + //
                "QbwwnDDQDcDfSbDbfhhrvrCtJMvJSCvvJh\r\n" + //
                "FWRjjLjmdZWdWNBFNWNlNQQrMGvvMGgssGvQRvrMJs\r\n" + //
                "BjWdlBpmdmBWFWdpWfPfpVnVwfHpqPQDbq\r\n" + //
                "SqrvlMldqvSWdGPTGzWpWpzpHP\r\n" + //
                "tRwmhtbsRRFsLwGGTVDHppTNdbVp\r\n" + //
                "FRCRQdCFtCLmBhCcmmQdhFdCvnfjffjZlZnjSnvfcSrrgMgn\r\n" + //
                "GQQtNJQWWcqPPhMMtwqD\r\n" + //
                "WpWLlBWZCvhjwMMZqDDP\r\n" + //
                "WgvmLVmHCbpppLgdllHddvCmFGzGnfsJJQJsJncSsccFVffF\r\n" + //
                "HcSsSlTTvvPPWWNMWWgPTPPbGbbrwJQbrrDphrHJJRpRhp\r\n" + //
                "ztfLqqzmRwDGlLDb\r\n" + //
                "fdVtmqjdZBmSvjsPSWlTgv\r\n" + //
                "DPvDhhMRRMhRNDLPMNsbwHwrjgnddqddrWdPtHzr\r\n" + //
                "pcBGSpcVBfJWCcmJGGwHtzgrrtwqzdrtrngG\r\n" + //
                "mllBlBZmMlQWRbQv\r\n" + //
                "SGZBSFMZllJWmzvfpp\r\n" + //
                "NTqbNrhHNHWgNqHrNhNQbbjHJLcnfnzLLnLmfcfccJcfQLcL\r\n" + //
                "HggbTNRRTHqqbVSGMSZVWDMDwVPs\r\n" + //
                "SBsSlvbPlFPvRlbPsMFZLgVLrLsJVgzrCJfVCH\r\n" + //
                "jcNddNdGzZrVgNVJ\r\n" + //
                "tTGwdcmWGdtwQmwmwZdwSlhBPbhPTBFRhlhSMFMR\r\n" + //
                "RzStzTzzvvQvSHVvhVgBqMMFqhPM\r\n" + //
                "ddlLLwNVLWLjbbLrjrbWrwmlhcFmBGgFMMPgBcGBBqPhggMs\r\n" + //
                "dLwdVCVWWdfNwNwLrWrbfbJNptzDDHRnHptHtznHTppnQCtR\r\n" + //
                "RzcfMBHLzpDQFmnDSWNB\r\n" + //
                "dbqjtjVqJZZGjPGJCPGbPndNNDglrmQmNSDgSlSSng\r\n" + //
                "hjCTqhCJbhVCGNvMcfvhfRLhvchz\r\n" + //
                "sDDqDMtqshJhPvhhCpSCCWlZHSWp\r\n" + //
                "bffRcbBGGTwGfGfbNjgSHZSgWwplHCClZZ\r\n" + //
                "RTQBbcnbRNmGbGTQLbmbJVqLllsDVMsPDVVvttMd\r\n" + //
                "nbLBjnqwgfRRBgBwnllbLlwScvPdZPcScZPcdFZJPvZPvcMZ\r\n" + //
                "tChQpphHrrHztssZdcDJcPZcMvWv\r\n" + //
                "hpTHVMQMtQtVpzBfwjfRnfwfnjVl\r\n" + //
                "ljJlvvJQlrlcJcWpPzgthnPnzMgpgSpC\r\n" + //
                "smtmZBmHZTVttHmqFqmzCSZSdndzShPNgPShgP\r\n" + //
                "bVqFHLqLqfHHFwbBLHcwDQrDrtjlQvGjlRQQ\r\n" + //
                "pwhVsPvVVCFtmhPhzqGqqZMZvGTTTMlGWM\r\n" + //
                "drrrrDfDRrNQdQdrRrBdjGWqWqWlGlGtlGbGZGBTLc\r\n" + //
                "tSDfgnHrdDtVSPSshJCSPh\r\n" + //
                "WlWlDqhglLhsdgrcbFdJJpPpdBbB\r\n" + //
                "ZQZvSvzRMSzjZjvZmMMpbFPQFVBrVbPcpbJFLB\r\n" + //
                "SwGZmjvCRSMRjMzZvRnstHftNfswHsflLhNWHf\r\n" + //
                "jsprCvGRQrtjCsQrGsrzvGHhgmHVmHZgggmMGVmhMbHm\r\n" + //
                "FFFdDSdwSffJWqqMzzMmDVbZ\r\n" + //
                "LLcdcfcfPwwBzdTTdtvlsrjCtvPvprnsjR\r\n" + //
                "MvtSqNSWMzjwzFTD\r\n" + //
                "ZRPlcRpQszNgszNwVT\r\n" + //
                "bcZcrcPlcPLLLZllPlbcbLSBfWCvHvWWNSmSqNqfWN\r\n" + //
                "rNdZpMGnddgggwHwzRPCzDDD\r\n" + //
                "vcvhcTLhZLhLPCPHPDPPVvzH\r\n" + //
                "LTmBmthWBchWLttttFJFLlFnGJNsfpdjNsnMnMpnpZdssn\r\n" + //
                "ZHWFCvqBDdqqqCTDHHBWrgppTMhhVpspMPQcSgQVPS\r\n" + //
                "jblbGffntRwltfMQVrrQscphfg\r\n" + //
                "ztJrGtbwGztbmtzzRGnRznWNNCWmHHdFHdFNWWHHqCqZ\r\n" + //
                "WGWSSZvVvqmrmzPm\r\n" + //
                "NgjtwFFlwDsFghNsMtlcjljcPqrQHcZzQznpQQprnqqzHQ\r\n" + //
                "tgMCwNhtgbdLZRbZCT\r\n" + //
                "PQSPQrSGZnGnVFhpVhRRlvLvBDRV\r\n" + //
                "tjctcjTMMpDTvFTlRD\r\n" + //
                "JCftsccFCcmsJJGZGGmPHnQrGwGS\r\n" + //
                "TrjRFFRnpnRCHNFSjSRrffJvJfzqQBsjqQqzzffd\r\n" + //
                "ZtlgMDhZhgmGDLVZLlGtLPqdQQvvfBJJqzzBPdMzdd\r\n" + //
                "VlLDgLLDWtGZwgtRNTNrFTqCwqHTrr\r\n" + //
                "LpcDFDMMPjMLLjpcDGCHgHssGHWnbCBWBHvm\r\n" + //
                "QfZhrhVVdZThlZlfVvVzZrTbgQnBHsCCHgJBsCsJBHmBmn\r\n" + //
                "wwtvfZztlTVlhtrzzlLNpFFRjMPDpRcPFwRj\r\n" + //
                "VzZhhQHQJJWJSSFWDGclbmNPgglPgVGc\r\n" + //
                "ddBTqCjjBCcrqrCRrwGPGmmDGmbpBGNpNNgg\r\n" + //
                "CRMjwsjwsLdLRrQFJSvMFMWZcHFW\r\n" + //
                "JgJJPvtrhRPQQzSRMQFFSF\r\n" + //
                "BLqsjsdLsMBqblnsGbBqVqdwSQSCSWwNFwczQWCNNwNCHn\r\n" + //
                "ljqbpLbbdDlbDbqDDVtMttTTgpJJgThhJrJr\r\n" + //
                "nflndmjbSnlTQGwvWGPHGRGj\r\n" + //
                "NtstcMcDJMvwgHfFvDgR\r\n" + //
                "qqqpLrMsLLqLNNnzbrdlbZSrznfz\r\n" + //
                "ttZCCFjNjnPVCFQPPFbbStrzqzqrrrcwtmJJ\r\n" + //
                "gTTMRMTWsTGGTddHTTbBzBLSmqbbJGzGmqqb\r\n" + //
                "HpgpMTvRhHHTRDhMsHdHDRhjJlVPJjNFJnnFpQQVfPCjnP\r\n" + //
                "VqJVQPpjQqPBbHwldmLfVVmd\r\n" + //
                "tMGvrzzDGCDDddwLbgLvLwcm\r\n" + //
                "TWDWCzTZDGMZtzWWtsFhbRRqRQRjhbNQBBTh\r\n" + //
                "zgLgLHnnzCCvnsHSsZBZBsTRdD\r\n" + //
                "rslllhJjcQNNGjpWJlSRTRdwBVSSNTPVSdPB\r\n" + //
                "jGrGqjJfqccrfqGcGplrJpFvzggqmCtMzmsMnvMvvCgm\r\n";
        return input.replace("\r", "");
    }
}
